package test.work.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.work.entity.Realm;
import test.work.repository.RealmRepository;

@Service
public class RealmServiceImpl implements RealmService {

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
    public Realm get(int id) {
        return null;
    }

}
