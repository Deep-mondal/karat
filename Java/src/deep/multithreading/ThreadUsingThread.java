package com.deep.multithreading;

public class ThreadUsingThread extends Thread {

    public void run() {
        for(int i=0;i<10;i++){
            try{
                System.out.println("Thread Using Thread");
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }

        }
    }

    public static void main(String[] args) {
      ThreadUsingThread tut=new ThreadUsingThread();
      tut.start();

    }
}
