package easyblood.backend.service;

import easyblood.backend.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
