package test.work.service;

import test.work.entity.Realm;
import test.work.exception.NotFoundException;

public interface RealmService {

    void save(Realm realm);

    Realm get(int id) throws NotFoundException;

}
