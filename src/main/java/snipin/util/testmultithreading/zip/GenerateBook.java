package snipin.util.testmultithreading.zip;

import org.h2.mvstore.ConcurrentArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class GenerateBook {

    Random random;
    int count;

    public GenerateBook(int count) {
        this.count = count;
        this.random = new Random(47);

    }

    private Book createBook(String pref) {
        long t = System.currentTimeMillis();
        int max = random.nextInt(100000);
        for (int i = 0; i < max; i++) {
            Double d = max / Math.PI;
            for (byte b = 0; b < d.byteValue(); b++) {
                d.hashCode();
            }
        }
        return new Book(max, pref + "#Book", pref + "#Description");
    }

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        for (int j = 0; j < count; j++) {
            books.add(createBook("OneThread"));
        }
        return books;
    }

    public List<Book> getFastBooks() {
        List<Book> books = new ArrayList<>();

        ExecutorService service = Executors.newFixedThreadPool(3);

        List<Future<List<Book>>> futures = new ArrayList<>();

        Runnable runnable = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("runnable: submit");
                Future<List<Book>> future = (service.submit(new ParallelBook(count)));
                futures.add(future);
            }
            for (Future<List<Book>> future : futures) {
                try {
                    System.out.println("count book in thread: " + future.get().size());
                    books.addAll(future.get());
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(runnable);
        System.out.println("Start thread");
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.shutdown();
        return books;
    }

    private class ParallelBook implements Callable<List<Book>> {

        private int count;
        private List<Book> books;

        ParallelBook(int count) {
            books = new ArrayList<>();
            this.count = count;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        @Override
        public List<Book> call() throws Exception {
            System.out.println("Runn parallel Book");
            for (int j = 0; j < count; j++) {
                books.add(createBook("OneThread#" + j + " "));
            }
            return books;
        }
    }
}
