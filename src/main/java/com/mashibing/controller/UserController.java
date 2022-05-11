package com.mashibing.controller;

import com.mashibing.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    Object o1 = null;
    Object o2 = null;

    @RequestMapping("/update")
    public String update(@ModelAttribute("user") User user){
        System.out.println("update-----------");
        o2 = user;
        System.out.println(user);
        System.out.println(o1 == o2);
        return "seccess";
    }

    @ModelAttribute
    public void testModelAttribute(Model model){
        System.out.println("testModelAttribute-----------");
        User user = new User();
        user.setId(1);
        user.setName("lisi");
        user.setAge(11);
        user.setPassword("123456");
        model.addAttribute("user",user);
        o1 = user;
    }
}
