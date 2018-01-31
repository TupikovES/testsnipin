package snipin.service;

import java.util.List;

public interface DataService<T> {
    T get(Long id);
    Long add(T t);
    void update(T t);
    void delete(T t);
    List<T> getAll();
    List<T> find(T t);
}
