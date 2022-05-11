package com.mashibing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * 在向页面回显数据的时候，可以在方法的参数中显示的声明
 * map：
 * modelMap：
 * model：
 * 都可以将数据进行回显，回显之后数据是保存在哪个作用域中的
 * page:当前页面
 * reqest：当前请求
 * session：当前回话
 * application：当前应用
 *      当使用上述参数传递数据的时候，回把数据都放置到request作用域中
 *
 */
@Controller
@SessionAttributes(value = {"username","msg"},types = Integer.class)
public class OutPutController {

    @RequestMapping("/output")
    public String output(Map<String ,String> map){
        map.put("msg","hello,springmvc");
        System.out.println(map.getClass());
        return "seccess";
    }

    @RequestMapping("/output2")
    public String output2(Model model){
        model.addAttribute("msg","hello,springmvc");
        System.out.println(model.getClass());
        return "seccess";
    }

    @RequestMapping("/output3")
    public String output3(ModelMap modelmap){
        modelmap.addAttribute("msg","hello,springmvc");
        System.out.println(modelmap.getClass());
        return "seccess";
    }

    @RequestMapping("/output4")
    public ModelAndView output4(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("seccess");
        mv.addObject("msg","springmvc");
        return mv;
    }

    /**
     * 当需要向session中设置数据的时候，可以在当前controller上添加@SessionAttributes注解
     * 此注解表示每次在向request作用域中设置属性值的时候，顺带着向session中保存一份
     *
     * value和图types都写上之后表示session中可以存储名字为value值的参数以及类型为Integer的参数
     * value和type可以分开单独使用，但是尽量不要使用type类型，因为会把所有符合类型的数据都设置到session中，导致session异常
     *
     * @param model
     * @return
     */
    @RequestMapping("/testsission")
    public String testsission(Model model){
        model.addAttribute("username","zhangsan");
        return "seccess";
    }
}
