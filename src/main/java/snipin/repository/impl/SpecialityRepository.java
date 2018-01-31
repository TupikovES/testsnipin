package snipin.repository.impl;

import org.springframework.stereotype.Repository;
import snipin.entity.Speciality;
import snipin.repository.DataRepository;

import java.io.Serializable;
import java.util.List;

@Repository("SpecialityRepository")
public class SpecialityRepository implements DataRepository<Speciality> {
    @Override
    public Speciality get(Serializable id) {
        return null;
    }

    @Override
    public Serializable add(Speciality speciality) {
        return null;
    }

    @Override
    public void update(Speciality speciality) {

    }

    @Override
    public void delete(Speciality speciality) {

    }

    @Override
    public List<Speciality> find(Speciality speciality) {
        return null;
    }

    @Override
    public List<Speciality> getAll() {
        return null;
    }
}
