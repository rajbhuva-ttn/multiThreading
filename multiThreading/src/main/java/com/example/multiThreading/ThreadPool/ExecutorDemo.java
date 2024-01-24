package com.example.multiThreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ThreadPool[] threadPools = {new ThreadPool("1"),new ThreadPool("2"),new ThreadPool("3"),new ThreadPool("4"),new ThreadPool("5"),new ThreadPool("6")};

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(ThreadPool threadPool: threadPools){
            executorService.submit(threadPool);
        }

        executorService.shutdown();
    }
}
