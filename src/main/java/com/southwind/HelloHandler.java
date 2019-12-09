package com.southwind;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloHandler {
    //视图解析器
    @RequestMapping("/index")
    public String index(){
        System.out.println("执行了index。");
        return "/index";
    }

}
