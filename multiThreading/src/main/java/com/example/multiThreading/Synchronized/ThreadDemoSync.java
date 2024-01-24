package com.example.multiThreading.Synchronized;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadDemoSync extends Thread{
    String name;

    public ThreadDemoSync(String name) {
        this.name = name;
    }

    public static synchronized void printName(String name){
        for(int i = 0; i<=3 ;i++){
            log.info("Hello "+name);

        }
    }

    @Override
    public void run(){
        ThreadDemoSync.printName(this.name);
    }
}
