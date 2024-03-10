package com.example.authorization.controller;

import com.example.authorization.model.User;
import com.example.authorization.service.Authorities;
import com.example.authorization.service.AuthorizationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class AuthorizationController {

    @Autowired
    AuthorizationService service;

    @PostMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestBody @Valid User user) {
        return service.getAuthorize(user);
    }
}
