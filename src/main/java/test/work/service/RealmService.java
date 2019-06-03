package test.work.service;

import test.work.entity.Realm;

public interface RealmService {

    void save(Realm realm);

    Realm get(int id);

}
