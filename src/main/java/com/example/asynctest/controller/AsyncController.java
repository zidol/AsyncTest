package com.example.asynctest.controller;

import com.example.asynctest.service.AsyncService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class AsyncController {

    private final AsyncService service;

    @GetMapping("/async")
    public String goAsync() {
        service.onAsync();
        String str = "Hello Spring Boot Async!!";
        log.info(str);
        log.info("==================================");
        return str;
    }

    @GetMapping("/sync")
    public String goSync() {
        service.onSync();
        String str = "Hello Spring Boot Sync!!";
        log.info(str);
        log.info("==================================");
        return str;
    }
}
