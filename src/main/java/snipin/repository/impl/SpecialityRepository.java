package snipin.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import snipin.entity.Speciality;
import snipin.repository.DataRepository;

import java.io.Serializable;
import java.util.List;

@Repository("specialityRepository")
public class SpecialityRepository implements DataRepository<Speciality> {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Speciality get(Serializable id) {
        return getSession().get(Speciality.class, id);
    }

    @Override
    public Serializable add(Speciality speciality) {
        return getSession().save(speciality);
    }

    @Override
    public void update(Speciality speciality) {
        getSession().update(speciality);
    }

    @Override
    public void delete(Speciality speciality) {
        getSession().delete(speciality);
    }

    @Override
    public List<Speciality> find(Speciality speciality) {
        return null;
    }

    @Override
    public List<Speciality> getAll() {
        return getSession().getNamedQuery("getAllSpeciality").list();
    }
}
