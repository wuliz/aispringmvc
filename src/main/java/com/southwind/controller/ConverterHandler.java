package com.southwind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/converter")
public class ConverterHandler {
    @RequestMapping(value = "/date",method = RequestMethod.POST)
    @ResponseBody
    public  String Date(Date date){
        return date.toString();
    }
}
