package snipin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import snipin.entity.Student;
import snipin.repository.DataRepository;
import snipin.service.DataService;

import java.util.List;

@Service("studentService")
@Transactional(readOnly = true)
public class StudentService implements DataService<Student> {

    @Autowired
    @Qualifier("studentRepository")
    private DataRepository<Student> repository;

    @Override
    public Student get(Long id) {
        return repository.get(id);
    }

    @Override
    @Transactional(readOnly = false)
    public Long add(Student student) {
        return (Long) repository.add(student);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Student student) {
        repository.update(student);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Student student) {
        if (repository.get(student.getId()) != null)
            repository.delete(student);
    }

    @Override
    public List<Student> getAll() {
        return repository.getAll();
    }

    @Override
    public List<Student> find(Student student) {
        return repository.find(student);
    }

}
