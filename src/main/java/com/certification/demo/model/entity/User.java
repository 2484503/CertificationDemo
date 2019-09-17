package com.certification.demo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;

    private String username;

    private String password;

    private int isValid;

    private Date createTime;

    private Date updateTime;
}