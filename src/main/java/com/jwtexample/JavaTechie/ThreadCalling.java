package com.jwtexample.JavaTechie;

public class ThreadCalling {
    public static void main(String[] args) {
        ThreadExplanation threadExplanation = new ThreadExplanation();
        threadExplanation.start();

        new ThreadUsingRunnable("first");
        new ThreadUsingRunnable("second");
        new ThreadUsingRunnable("third");

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            System.out.println("Thread Interrupted");
        }
        System.out.println("Main Thread exiting");
    }
}
