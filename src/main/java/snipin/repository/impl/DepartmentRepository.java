package snipin.repository.impl;

import org.springframework.stereotype.Repository;
import snipin.entity.Department;
import snipin.repository.DataRepository;

import java.io.Serializable;
import java.util.List;

@Repository("DepartmentRepository")
public class DepartmentRepository implements DataRepository<Department> {
    @Override
    public Department get(Serializable id) {
        return null;
    }

    @Override
    public Serializable add(Department department) {
        return null;
    }

    @Override
    public void update(Department department) {

    }

    @Override
    public void delete(Department department) {

    }

    @Override
    public List<Department> find(Department department) {
        return null;
    }

    @Override
    public List<Department> getAll() {
        return null;
    }
}
