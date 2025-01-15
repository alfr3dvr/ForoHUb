package com.alurachallenge.ForoHub.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")

public class ControlEnlaces {

    @GetMapping
    public String helloword(){
        return "Hello Word actualizacion";
    }
}

