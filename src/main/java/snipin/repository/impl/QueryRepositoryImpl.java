package snipin.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import snipin.repository.QueryRepository;

import java.util.List;

@Repository("queryRepository")
public class QueryRepositoryImpl implements QueryRepository {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List query(String query) {
        return getSession().createNativeQuery(query).list();
    }
}
