package com.deep.multithreading;

public class ThreadUsingRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Using Runnable");
    }

    public static void main(String[] args) {
        ThreadUsingRunnable tur=new ThreadUsingRunnable();
        Thread t=new Thread(tur);
        t.start();

    }
}
