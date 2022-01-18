package com.geraldelorm.conference.controller;

import com.geraldelorm.conference.model.Registration;
import com.geraldelorm.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstname", defaultValue = "Gerald") String firstname,
                        @RequestParam(value = "lastname", defaultValue = "Gbagbe") String lastname,
                        @RequestParam(value = "age", defaultValue = "22") int age) {
        User user = new User();

        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user){
        System.out.println(user.toString());
        return user;
    }
}
