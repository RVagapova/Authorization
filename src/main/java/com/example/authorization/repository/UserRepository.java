package com.example.authorization.repository;

import com.example.authorization.service.Authorities;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if ("Ivan".equals(user) && "qwerty1".equals(password)) {
            List<Authorities> authorities = new ArrayList<>();
            authorities.add(Authorities.READ);
            authorities.add(Authorities.WRITE);
            return authorities;
        } else {
            return new ArrayList<>();
        }
    }
}
