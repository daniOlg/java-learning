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