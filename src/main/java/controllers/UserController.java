package controllers;

import dao.UserDao;
import models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {


    private UserDao userDao;
    @GetMapping("/users")
    public String findAll(Model model) {
        List<User> users = userDao.findAll();
        model.addAttribute("users",users);
        return "users";
    }

    @GetMapping("/create")
    public String createUserForm(User user) {
        return "create";
    }

    @PostMapping
    public String createUser(User user) {
        userDao.saveUser(user);
        return "redirect:/users";
    }
}
