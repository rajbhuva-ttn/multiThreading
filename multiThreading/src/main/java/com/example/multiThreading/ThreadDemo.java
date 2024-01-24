package com.example.multiThreading;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadDemo extends Thread{

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo threadDemo = new ThreadDemo();
        ThreadDemo threadDemo2 = new ThreadDemo();
//        threadDemo2.setPriority(MAX_PRIORITY);
        threadDemo2.start();
//        threadDemo.setPriority(MIN_PRIORITY);
        threadDemo.start();
//        threadDemo.join();
//        threadDemo2.join();
        log.info("Program Exited");

    }



    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            log.info(String.valueOf("Hello "+Thread.currentThread().getName()));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
