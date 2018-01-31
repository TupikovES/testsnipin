package snipin.repository;

import snipin.entity.Student;

import java.io.Serializable;
import java.util.List;

public interface DataRepository<T> {
    T get(final Serializable id);
    Serializable add(T t);
    void update(T t);
    void delete(T t);
    List<T> find(T t);
    List<T> getAll();
}
