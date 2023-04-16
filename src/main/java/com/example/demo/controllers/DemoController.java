package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    @GetMapping("/test")
    public ResponseEntity<Map<String,String>> test(){
        Map responce = new HashMap<String,String>();
        responce.put("message","Success");
        return ResponseEntity.ok(responce);
    }
}
