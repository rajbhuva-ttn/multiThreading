package com.example.multiThreading.ThreadPool;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadPool implements Runnable{

    String name;

    public ThreadPool(String name) {
        this.name = name;
    }

    @Override
    public void run(){
        log.info("Thread Started Working " + this.name);
        for (int i = 0; i <= 3; i++) {
            log.info(String.valueOf(i));

        }
        log.info("Thread finished Working " + this.name);

    }
}
