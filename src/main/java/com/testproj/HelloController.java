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
        return "Hello World" + MyMethodWithManyParameters(4,2,1,"oops,", "it's long", 456L);
    }

    private String MyMethodWithManyParameters(int aaaaa, int bbbbbb, int c, String oooh, String my, long parameterList){
        int other = 0;
        int intSum = aaaaa + bbbbbb + c;
        String concatedString = oooh + my + (parameterList + intSum);
        return concatedString;
    }
}
