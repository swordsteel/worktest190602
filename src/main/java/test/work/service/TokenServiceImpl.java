package test.work.service;

import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService {

    @Override
    public String get() {
        return "secretAreNotSupposedToBeStatic!";
    }

}
