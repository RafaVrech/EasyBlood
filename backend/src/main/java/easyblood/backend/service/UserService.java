package easyblood.backend.service;

import easyblood.backend.model.User;

import java.util.List;

public interface UserService {
    boolean save(User user);
    User findByUsername(String username);
    User findByCpf(String username);
    List<User> todos();
    boolean update(User user);
}
