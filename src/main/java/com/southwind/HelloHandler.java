package com.southwind;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//如果只在方法中加映射的话，可以不同类的映射是一样的。不便区分，最好在类上也加上映射
@Controller
@RequestMapping("/hello")
public class HelloHandler {

    //请求地址映射
    @RequestMapping("/index")
    public String index(){
        System.out.println("执行了index。");
        return "/index";//逻辑视图
    }

}
