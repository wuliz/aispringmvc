package com.southwind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//如果只在方法中加映射的话，可以不同类的映射是一样的。不便区分，最好在类上也加上映射
@Controller
@RequestMapping("/hello")
public class HelloHandler {

    //请求地址映射,请求方式，及请求需要带的参数
    @RequestMapping(value = "/index",method = RequestMethod.GET,params = {"name","id"})
    public String index(String name,Integer id){//通过HandlerAdapter对参数进行处理（类型自动转换），这里可以同名直接获取
        // public String index(@RequestParam("name") String str,@RequestParam("id") Integer id1){如果接收的参数名不一致，需要用@RequestParam注解映射
        System.out.println("执行了index"+name+id+"");
        return "/index";//逻辑视图
    }

}
