package com.example.multiThreading.Callable;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Slf4j
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPool[] threadPools = {new ThreadPool(1),new ThreadPool(2),new ThreadPool(3),
                new ThreadPool(4),new ThreadPool(5),new ThreadPool(6)};

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(ThreadPool threadPool: threadPools){
            Future<Integer> submit = executorService.submit(threadPool);
            log.info(String.valueOf(submit.get()));
        }

        executorService.shutdown();
    }
}
