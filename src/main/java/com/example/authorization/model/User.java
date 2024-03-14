package com.example.authorization.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {
    @NotNull
    @Size(min = 2, max = 30)
    private String name;
    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
