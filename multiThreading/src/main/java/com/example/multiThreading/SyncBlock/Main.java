package com.example.multiThreading.SyncBlock;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        ThreadDemoSync threadDemo1 = new ThreadDemoSync("Raj");
        ThreadDemoSync threadDemo2 = new ThreadDemoSync("Vaibhav");
        ThreadDemoSync threadDemo3 = new ThreadDemoSync("Mohit");
        threadDemo1.start();
        threadDemo2.start();
        threadDemo3.start();

        log.info("Program Exited");
    }

    @Override
    protected void finalize(){
        log.info("Finalize");

    }
}
