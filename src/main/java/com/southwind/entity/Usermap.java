package com.southwind.entity;

import lombok.Data;

import java.util.Map;

@Data
public class Usermap {
    private Map<String,User> map;
}
