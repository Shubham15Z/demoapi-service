package com.sz.apidemo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/getUserInfo")
    public String GetUserInfo(@RequestBody UserDetail userDetail){
        System.out.println("Request from : "+userDetail.username + " with message : "+userDetail.message);
        return "processed the request";
    }
}
