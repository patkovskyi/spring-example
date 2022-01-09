package com.ptkvsk.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello/{world}")
    public String hello(@PathVariable("world") String world) {
        return "hello," + world;
    }
}
