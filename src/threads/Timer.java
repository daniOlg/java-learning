package threads;

import java.util.Date;

// Creamos una clase para recrear un temporizador
public class Timer extends Thread {
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