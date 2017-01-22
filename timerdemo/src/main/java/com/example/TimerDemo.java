package com.example;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {

    public static Timer timer1;
    public static Timer timer2;
    public static Timer timerKiller;

    public static void main(String args[]){

        // Timer Objects
        timer1 = new Timer();
        timer2 = new Timer();
        timerKiller = new Timer();

        // Define Timer Periods
        int Timer1Period = 30; //milliseconds
        int Timer2Period = 40; //milliseconds
        int Timer3Period = 1000; //termination time = 10 seconds

        TimerTask t1Task = new TimerTask() {

            public void run(){
                System.out.println("Timer 1 is UP!");
            }
        };

        TimerTask t2Task = new TimerTask() {

            public void run(){
                System.out.println("Timer 2 is UP!");
            }
        };

        TimerTask t3Task = new TimerTask() {

            public void run(){
                System.out.println("Program END!");
                timer1.cancel();
                timer2.cancel();
            }
        };

        //Periodic (xxxx, first time to start, repeating trigger time)
        timer1.schedule(t1Task, Timer1Period, Timer1Period);
        timer2.schedule(t2Task, Timer2Period, Timer2Period);

        //One-Shot Timer, don't need to tell the timer the period...duh
        timerKiller.schedule(t3Task, Timer3Period);

    }
}
