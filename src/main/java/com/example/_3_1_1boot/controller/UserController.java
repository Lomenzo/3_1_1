package com.example._3_1_1boot.controller;

import com.example._3_1_1boot.dao.UserDao;
import com.example._3_1_1boot.model.User;
import com.example._3_1_1boot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@EnableAutoConfiguration
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/userApp")        //  http://localhost:8080/userApp
    //@ResponseBody
    public String showUserForm(ModelMap modelMap) {
//        List<User> usersList = new ArrayList<>();
//        usersList.add(new User((long)1, "Evgen", "snd", 100000));
//        usersList.add(new User((long)2, "Vova", "imka", 200000));
//        User user = new User();
//        User fromDB = userService.saveUser(new User("Reyhan", "Igor", 90000));
//        usersList.add(fromDB);

        List<User> userList = userService.getUserList();
        modelMap.addAttribute("users", userList);
        return "userPage";
    }
}
