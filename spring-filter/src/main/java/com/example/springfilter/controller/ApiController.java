package com.example.springfilter.controller;import com.example.springfilter.dto.User;import lombok.extern.slf4j.Slf4j;import org.springframework.web.bind.annotation.PostMapping;import org.springframework.web.bind.annotation.RequestBody;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RestController;@Slf4j // for Java sysout보다 lombok으로 로깅을 사용.@RestController@RequestMapping("/api/user")public class ApiController {    @PostMapping("")    public User user(            @RequestBody User user    ) {        log.info("User: {}", user);        return user;    }}