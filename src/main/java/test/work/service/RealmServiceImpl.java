package test.work.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.work.entity.Realm;
import test.work.exception.NotFoundException;
import test.work.repository.RealmRepository;

import java.util.function.Supplier;

@Service
public class RealmServiceImpl implements RealmService {

    private static final Supplier<NotFoundException> NOT_FOUND_EXCEPTION_SUPPLIER = () -> new NotFoundException();

    @Qualifier("realmRepository")
    @Autowired
    private RealmRepository realmRepository;

    @Override
    @Transactional
    public void save(Realm realm) {
        realmRepository.save(realm);
    }

    @Override
    @Transactional
    public Realm get(int id) throws NotFoundException {
        return realmRepository.findById(id).orElseThrow(NOT_FOUND_EXCEPTION_SUPPLIER);
    }

}
