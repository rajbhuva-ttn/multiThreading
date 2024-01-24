package com.example.multiThreading.Callable;


import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;

@Slf4j
public class ThreadPool implements Callable<Integer> {

    Integer name;

    public ThreadPool(Integer name) {
        this.name = name;
    }

    @Override
    public Integer call() {
        log.info("Started Thread "+ this.name);
        for (int i = 0; i <= 3; i++) {
            log.info(String.valueOf(i));
        }
        log.info("Finished Thread "+ this.name);

        return this.name;
    }
}
