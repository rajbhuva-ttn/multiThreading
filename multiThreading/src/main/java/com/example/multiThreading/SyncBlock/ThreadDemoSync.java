package com.example.multiThreading.SyncBlock;


import lombok.Synchronized;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadDemoSync extends Thread{
    String name;

    public ThreadDemoSync(String name) {
        this.name = name;
    }

    public static void printName(String name){

        log.info("Hello " + name); // not sync statement
        synchronized (ThreadDemoSync.class) {
            for (int i = 0; i <= 3; i++) {
                log.info(String.valueOf(i));

            }
            System.gc();
        }
    }

    @Override
    public void run(){
        ThreadDemoSync.printName(this.name);
    }
}
