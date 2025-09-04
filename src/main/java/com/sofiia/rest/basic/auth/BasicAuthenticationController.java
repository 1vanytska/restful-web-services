package com.sofiia.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {

    //basicauth
    @GetMapping(path = "basicauth")
    public AuthenticationBean helloWorldBean() {
//        throw new RuntimeException("Some Error has Happened! Contact Support at ***-***");
        return new AuthenticationBean("You are authenticated"); //can actually send a lot more details as part of the response.Maybe the rules the user has and things like that.
    }
}
