package com.testproj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 8560w on 2017.01.19..
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "Hello World";
    }
}
