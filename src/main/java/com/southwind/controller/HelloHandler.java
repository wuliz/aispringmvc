package com.southwind.controller;

import com.southwind.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//如果只在方法中加映射的话，可以不同类的映射是一样的。不便区分，最好在类上也加上映射
@Controller
@RequestMapping("/hello")
public class HelloHandler {

    //请求地址映射,请求方式，及请求需要带的参数
    @RequestMapping(value = "/index",method = RequestMethod.GET,params = {"name","id"})
    public String index(String name,Integer id){//通过HandlerAdapter对参数进行处理（类型自动转换），这里可以同名直接获取
        // public String index(@RequestParam("name") String str,@RequestParam("id") Integer id1){如果接收的参数名不一致，需要用@RequestParam注解映射
        System.out.println("执行了index"+name+id+"");
        return "/view/hello";//逻辑视图
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(User u){
        System.out.println(u);
        return "/index";
    }
    @RequestMapping("/cookie")
    public String cookie(@CookieValue(value = "JSESSIONID") String sessionId){
        System.out.println(sessionId);
        return "index";
    }

    //请求转发
    @RequestMapping("/forward")
    public String forward(){
        return "forward:/index.jsp";
        //return "index";默认为转发
    }

    //重定向
    @RequestMapping("/redirect")
    public String redirect(){
        return "redirect:/index.jsp";
    }

    //基本数据类型，如果前端没有传id这个参数  HandlerAdapter就会把null赋值给int类型的id 出现类型转换错误（包装类可以解决这个问题）
    @RequestMapping("/baseType")
    @ResponseBody//直接返回值给客户端，不进行映射
    public String baseType(int id){
        return id+"";
    }

    @RequestMapping("/packageType")
    @ResponseBody
    public String packageType(@RequestParam(value = "num",required = false,defaultValue = "0") Integer id){
        return id+"";
    }

}
