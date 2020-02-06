package com.southwind.controller;

import com.southwind.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Spring MVC 提供了以下⼏种⽅式添加模型数据：
 * Map
 * Model
 * ModelAndView
 * @SessionAttribute
 * @ModelAttribute
 */
@Controller
@RequestMapping("/viewHandler")
public class ViewHandler {
    @RequestMapping("/map")
    public  String map(Map<String, User> map){
        User user = new User();
        user.setId(1);
        user.setName("张三");
        map.put("user",user);
        return "view/view";
    }
    @RequestMapping("/model")
    public  String model(Model m){
        User user = new User();
        user.setId(2);
        user.setName("李四");
        m.addAttribute("user",user);
        return "view/view";
    }
    @RequestMapping("/modelAndView")
    public ModelAndView modelAndView(){
        ModelAndView mav = new ModelAndView();
        User user = new User();
        user.setId(3);
        user.setName("王五");
        mav.addObject("user",user);
        mav.setViewName("view/view");
        return mav;
    }
    @RequestMapping("/modelAndView2")
    public ModelAndView modelAndView2(){
        ModelAndView mav = new ModelAndView();
        User user = new User();
        user.setId(4);
        user.setName("六");
        mav.addObject("user",user);
        InternalResourceView view = new InternalResourceView("/view/view.jsp");
        mav.setView(view);
        return mav;
    }
    @RequestMapping("/request")
    public String request(HttpServletRequest request){
        User user = new User();
        user.setName("七");
        user.setId(7);
        request.setAttribute("user",user);
        return "view/view";
    }
}
