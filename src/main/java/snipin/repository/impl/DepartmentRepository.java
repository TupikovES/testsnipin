package snipin.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import snipin.entity.Department;
import snipin.repository.DataRepository;

import java.io.Serializable;
import java.util.List;

@Repository("departmentRepository")
public class DepartmentRepository implements DataRepository<Department> {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Department get(Serializable id) {
        return getSession().get(Department.class, id);
    }

    @Override
    public Serializable add(Department department) {
        return getSession().save(department);
    }

    @Override
    public void update(Department department) {
        getSession().update(department);
    }

    @Override
    public void delete(Department department) {
        getSession().delete(department);
    }

    @Override
    public List<Department> find(Department department) {
        return null;
    }

    @Override
    public List<Department> getAll() {
        return getSession().getNamedQuery("getAllDepartment").list();
    }
}
