package com.example.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ControllerApi {

    @GetMapping("")
    public ResponseEntity<String> grettings(){
        return ResponseEntity.ok("test");
    }

}
