package com.southwind.entity;

import lombok.Data;

@Data
public class User {
    private String name;
    private Integer id;
    private Address address;

}
