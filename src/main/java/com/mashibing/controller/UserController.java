package com.mashibing.controller;

import com.mashibing.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * sessionAttributes要注意，再使用的时候如果没有对应的值，可能会报异常
 *
 * 在使用@modelAttribute的时候，需要注意
 * 如果参数的注解没有名字的话，默认使用参数名称的首字母小写来匹配
 * 如果有值，直接返回，如果没有值，会去session中进行查找，也就是说会判断当前类上是否添加过@SessionAttribute注解
 * 推荐注解中，最好添加参数，来作为唯一标识，进行对象属性的赋值
 */
@Controller
public class UserController {

    Object o1 = null;
    Object o2 = null;
    Model m1 = null;

    @RequestMapping("/update")
    public String update(@ModelAttribute("user") User user,Model model){
        System.out.println("update-----------");
        o2 = user;
        System.out.println(user);
        System.out.println(o1 == o2);
        System.out.println(m1 == model);
        return "seccess";
    }

    @RequestMapping("/update2")
    public String update2(){
        System.out.println("update2---------");
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
        m1 = model;
    }

    @ModelAttribute
    public void testModelAttribute2(Model model){
        System.out.println("testModelAttribute2-----------");
    }
}
