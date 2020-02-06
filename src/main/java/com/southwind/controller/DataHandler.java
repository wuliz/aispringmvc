package com.southwind.controller;

import com.southwind.entity.User;
import com.southwind.entity.UserList;
import com.southwind.entity.Usermap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController//通过restController注解，不需要再在方法中加ResponsBody
@RequestMapping("/rest")
public class DataHandler {
    //数组数据绑定
    @RequestMapping("/array")
    public String array(String[] name){//http://localhost:8082/aispringmvc1_war_exploded/rest/array?name=1&name=2
        return Arrays.toString(name);
    }

    //list数据绑定：springmvc 不支持list类型直接转换，需要进行包装

    /**
     * @param list
     * @return
     */
    @RequestMapping("/list")
    public String list(UserList list){
        StringBuffer str = new StringBuffer();
        for(User u:list.getList()){
            str.append(u);
        }
        return  str.toString();
    }

    @RequestMapping("/map")
    public String map(Usermap map){
        StringBuffer str = new StringBuffer();
        for(String key : map.getMap().keySet()){
            User user = map.getMap().get(key);
            str.append(user);
        }
        return str.toString();
    }
}
