// This Project created by Anton Romanov (www.antonromanov.com) 09.01.2018 at 15:45
// Source URL - http://javasampleapproach.com/java-integration/integrate-angular-4-springboot-web-app-springtoolsuite#I_Technologies
// Git Hub repo - ...
package com.antonromanov.springbootstarterwebpf2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//@RestController

@RestController
@RequestMapping("/rest/user")
public class WebRestController {
/*
    @RequestMapping("/rest/hi")
    public String hi() {
        return "Hello World from Restful API";
    }

*/

    String json = "{\"id\":2488,\"content\":\"Hello!\"}";

    @GetMapping(value="/hello")
    public String hi(@RequestParam(value = "name") String name){
        //    return name+" - TEST";
        return json;
    }



}
