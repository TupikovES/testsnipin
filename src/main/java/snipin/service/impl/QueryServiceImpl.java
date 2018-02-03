package snipin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import snipin.repository.QueryRepository;
import snipin.service.QueryService;

import java.util.List;

@Service("queryService")
@Transactional(readOnly = true)
public class QueryServiceImpl implements QueryService {

    @Autowired
    @Qualifier("queryRepository")
    private QueryRepository repository;

    @Override
    public List query(String query) {
        return repository.query(query);
    }
}
