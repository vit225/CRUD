package dao;

import models.User;

import java.util.List;

public interface UserDao {

    User findById(long id);

    List<User> findAll();

    User saveUser(User user);

    void deleteById(long id);
}
