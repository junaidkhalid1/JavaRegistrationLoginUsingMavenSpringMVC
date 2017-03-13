package com.jk.account.service;

import com.jk.account.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
