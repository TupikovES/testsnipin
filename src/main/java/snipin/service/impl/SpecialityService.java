package snipin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import snipin.entity.Speciality;
import snipin.repository.DataRepository;
import snipin.service.DataService;

import java.util.List;

@Service("specialityService")
@Transactional(readOnly = true)
public class SpecialityService implements DataService<Speciality> {

    @Autowired
    @Qualifier("specialityRepository")
    private DataRepository<Speciality> repository;

    @Override
    public Speciality get(Long id) {
        return repository.get(id);
    }

    @Override
    @Transactional(readOnly = false)
    public Long add(Speciality speciality) {
        return (Long) repository.add(speciality);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Speciality speciality) {
        repository.update(speciality);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Speciality speciality) {
        if (get(speciality.getId()) != null)
            repository.delete(speciality);
    }

    @Override
    public List<Speciality> getAll() {
        return repository.getAll();
    }

    @Override
    public List<Speciality> find(Speciality speciality) {
        return repository.find(speciality);
    }
}
