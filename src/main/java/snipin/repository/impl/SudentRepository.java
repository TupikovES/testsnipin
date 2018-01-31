package snipin.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import snipin.entity.Student;
import snipin.repository.DataRepository;

import java.io.Serializable;
import java.util.List;

@Repository("studentRepository")
public class SudentRepository implements DataRepository<Student> {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Student get(Serializable id) {
        return getSession().get(Student.class, id);
    }

    @Override
    public Serializable add(Student student) {
        return getSession().save(student);
    }

    @Override
    public void update(Student student) {
        getSession().update(student);
    }

    @Override
    public void delete(Student student) {
        getSession().delete(student);
    }

    @Override
    public List<Student> find(Student student) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return getSession().getNamedQuery("getAllStudent").list();
    }
}
