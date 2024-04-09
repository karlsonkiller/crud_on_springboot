package ru.project.crud_on_springboot.dao;

import ru.project.crud_on_springboot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();
    User foundUser(Long id);
    void save(User user);
    void updateUser(Long id, User user);
    void deleteUser(Long id);
}
