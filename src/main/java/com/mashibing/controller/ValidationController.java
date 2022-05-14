package com.mashibing.controller;


import com.mashibing.bean.Person;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ValidationController {

    @RequestMapping("/validate")
    public String validate(@Valid Person person , BindingResult bindingResult, Model model){

        System.out.println(person);

        if(bindingResult.hasErrors()){
            System.out.println("登录失败");
            Map<String,Object> map = new HashMap<String, Object>();
            bindingResult.getFieldError();
            //获取到当前所有的错误
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for(FieldError fieldError:fieldErrors){
                System.out.println(fieldError.getField());
                System.out.println(fieldError.getDefaultMessage());
                map.put(fieldError.getField(),fieldError.getDefaultMessage());
            }
            model.addAttribute("errors",map);
            return "forward:/login.jsp";
        }
        System.out.println("登录成功");
        return "success";
    }
}
