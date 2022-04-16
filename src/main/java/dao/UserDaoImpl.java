package dao;

import models.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private final EntityManager manager;

    public UserDaoImpl(EntityManager manager) {
        this.manager = manager;
    }

    public EntityManager getManager() {
        return manager;
    }


    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
