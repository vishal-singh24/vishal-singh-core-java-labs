package com.vishal.lab8.ex2;


public class TimerMain {
    public static void main(String[] args) {
        TimerThread timerThread = new TimerThread();
        Thread thread = new Thread(timerThread);
        
        thread.start();
    }
}