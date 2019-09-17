package com.certification.demo.controller;

import com.certification.demo.model.entity.User;
import com.certification.demo.sdk.LoginClient;
import com.certification.demo.service.UserService;
import com.certification.demo.utils.MD5Util;
import com.certification.demo.utils.TokenProccessorUtil;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijn
 * @version 1.0
 * @date 2019/9/17 10:25
 */
@RestController
public class LoginController implements LoginClient {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String login(String username, String password) {
        String passwordMd5 = MD5Util.getMD5(password);

        User user = userService.getUserByNamePassword(username,passwordMd5);

        if (user == null){
            return null;
        }
        String token = TokenProccessorUtil.getInstance().makeToken();
        return token;
    }
}
