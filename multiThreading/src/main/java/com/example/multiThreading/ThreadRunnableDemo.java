package com.example.multiThreading;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadRunnableDemo implements Runnable{

    public static void main(String[] args) throws InterruptedException {

        ThreadRunnableDemo threadRunnableDemoe = new ThreadRunnableDemo();
        Thread thread1 = new Thread(threadRunnableDemoe);
        Thread thread2 = new Thread(threadRunnableDemoe);

        thread1.start();
        thread2.start();

        log.info("Program Exited");

    }

    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            log.info(String.valueOf("Hello "+Thread.currentThread().getName()));
            Thread.yield(); // wait till main thread finished it's execution
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
