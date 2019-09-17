package com.certification.demo.model.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserParam {
    private int id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    private int isValid;

    private Date createTime;

    private Date updateTime;
}