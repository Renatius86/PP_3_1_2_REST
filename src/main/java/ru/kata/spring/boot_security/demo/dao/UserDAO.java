package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    User getUserById(int id);
    void saveUser(User user);
    void deleteUser(int id);
    void updateUser(User user);

    User getUserByUsername(String username);
}
