package br.com.university.nilone.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("health")
public class PingHealth {

    @GetMapping("")
    public String healthCheck(){
        return "it's working !";
    }

}
