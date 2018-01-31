package snipin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import snipin.entity.Department;
import snipin.repository.DataRepository;
import snipin.service.DataService;

import java.util.List;

@Service("departmentService")
@Transactional(readOnly = true)
public class DepartmentService implements DataService<Department> {

    @Autowired
    @Qualifier("departmentRepository")
    private DataRepository<Department> repository;

    @Override
    public Department get(Long id) {
        return repository.get(id);
    }

    @Override
    @Transactional(readOnly = false)
    public Long add(Department department) {
        return (Long) repository.add(department);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Department department) {
        repository.update(department);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Department department) {
        if (get(department.getId()) != null)
            repository.delete(department);
    }

    @Override
    public List<Department> getAll() {
        return repository.getAll();
    }

    @Override
    public List<Department> find(Department department) {
        return repository.find(department);
    }

}
