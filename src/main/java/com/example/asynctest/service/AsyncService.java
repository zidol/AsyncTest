package com.example.asynctest.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AsyncService {

    //비동기로 동작하는 메소드
    @Async
    public void onAsync() {
        try {
            Thread.sleep(5000);
            log.info("onAsync");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void onSync() {
        try {
            Thread.sleep(5000);
            log.info("onSync");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
