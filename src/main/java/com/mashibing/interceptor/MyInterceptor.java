package com.mashibing.interceptor;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * preHandle:在处理器开始之前进行执行
 *
 * postHandle：在处理器完成方法之后执行
 *
 * afterCompletion：整个servlet处理完成之后才会执行，主要做资源清理的工作
 *
 * 执行顺序：
 * preHandle  --》目标方法   --》postHandle --》先页面跳转  --》afterCompletion
 *
 *
 * 拦截器
 */
public class MyInterceptor implements HandlerInterceptor {

    //前置
    //注意返回true才会开始继续向下执行
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(this.getClass().getName()+"-----preHandle");
//        return false;
        return true;
    }
    //后置
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println(this.getClass().getName()+"-----postHandle");
    }
    //结束之后
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println(this.getClass().getName()+"-----afterCompletion");
    }
}
