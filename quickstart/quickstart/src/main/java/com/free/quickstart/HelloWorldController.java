package com.free.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(path = "/hello")
    public String HelloWorld()
    {
        return "Hello welcome to Ultimate guide to spring boot";
    }
}
