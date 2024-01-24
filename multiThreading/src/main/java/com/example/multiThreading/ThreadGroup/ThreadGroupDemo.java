package com.example.multiThreading.ThreadGroup;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadGroupDemo {
    public static void main(String[] args) {

        log.info(Thread.currentThread().getName());
        log.info(Thread.currentThread().getThreadGroup().getName());

        ThreadGroup parentGroup = new ThreadGroup("ParentGroup");
        ThreadGroup child = new ThreadGroup(parentGroup,"child");
        log.info(child.getName());
        log.info(child.getParent().getName());

        Thread thread1 = new Thread(child,"T1");
        Thread thread2 = new Thread(child,"T2");
        Thread thread3 = new Thread(child,"T3");
        log.info(thread1.getThreadGroup().getName());
        log.info(String.valueOf(thread3.isDaemon()));
        thread3.setDaemon(true);
        log.info(String.valueOf(thread3.isDaemon()));

        log.info(String.valueOf(thread1.isAlive()));

    }
}
