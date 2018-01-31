package snipin.repository.impl;

import org.springframework.stereotype.Repository;
import snipin.entity.Student;
import snipin.repository.DataRepository;

import java.io.Serializable;
import java.util.List;

@Repository("StudentRepository")
public class SudentRepository implements DataRepository<Student> {
    @Override
    public Student get(Serializable id) {
        return null;
    }

    @Override
    public Serializable add(Student student) {
        return null;
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(Student student) {

    }

    @Override
    public List<Student> find(Student student) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return null;
    }
}
