package com.example.myproject.restapi;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping(value = "/hello-world", produces = MediaType.APPLICATION_JSON_VALUE)
    public MyResponse get() {
        return new MyResponse("Hello World!");
    }

}
