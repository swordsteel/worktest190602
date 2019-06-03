package test.work.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.work.entity.Realm;

@Repository("realmRepository")
public interface RealmRepository extends JpaRepository<Realm, Integer> {}
