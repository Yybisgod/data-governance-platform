package com.qinxy.dto;

import lombok.Data;

/**
 * Created by qinxy on 2019/7/2.
 */
@Data
public class LoginDTO extends BaseDTO{

    private String username;

    private String password;
}
