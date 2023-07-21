package threads;

import java.util.ArrayList;
import java.util.Date;

// Permite la ejecución de varias tareas de forma simultánea
public class Threads {
    public static void main(String[] args) {
        Timer timer1 = new Timer(10, 1);
        Timer timer2 = new Timer(5, 2);
        Timer timer3 = new Timer(15, 3);

        timer1.start();
        timer2.start();
        timer3.start();
    }
}

// Creamos una clase para recrear un temporizador
class Timer extends Thread {
    int id;
    private final int seconds;

    public Timer(int seconds, int id) {
        this.seconds = seconds;
        this.id = id;
    }

    public void run() {
        System.out.println("Crono #" + id + " started at " + new Date() + " for " + this.seconds + " seconds");
        sleep(this.seconds);
        System.out.println("Crono #" + id + " ended at " + new Date());
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}