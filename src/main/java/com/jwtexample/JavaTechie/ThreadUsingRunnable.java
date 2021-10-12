package com.jwtexample.JavaTechie;

public class ThreadUsingRunnable implements Runnable{
    String name;
    Thread t;
    ThreadUsingRunnable(String thread){
        name = thread;
        t = new Thread(this, name);
        System.out.println("New Thread : "+t);
        t.start();
    }
    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println(name+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(name + "Interrupted");
            }
            System.out.println(name+"Exiting");
        }
    }
}
