package com.example.multiThreading.Interrupt;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadDemo extends Thread{

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
        threadDemo.interrupt();
        log.info("Program Exited");
    }

    @Override
    public void run(){
        try {
            for(int i=0;i<=5;i++){
                log.info(String.valueOf("Hello "+Thread.currentThread().getName()));
                    Thread.sleep(100); //interrupted because of the sleep.
            }
        } catch (InterruptedException e) {
            log.info("Flow Interrupted");
        }

    }
}
