package com.mashibing.view;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@Component
public class MyViewResolver implements ViewResolver {

    public View resolveViewName(String viewName, Locale locale) throws Exception {

        if(viewName.startsWith("msb:")){
            System.out.println(viewName);
            return new MyView();
        }else{
            return null;
        }
    }
}
