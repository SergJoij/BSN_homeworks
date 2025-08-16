package Task2;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore1 = new Semaphore(1);
        Semaphore semaphore2 = new Semaphore(0);

        Runnable task1 = () -> {
            while (true) {
                try {
                    semaphore1.acquire();
                    write("1");
                    semaphore2.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        };

        Runnable task2 = () -> {
            while (true) {
                try {
                    semaphore2.acquire();
                    write("2");
                    semaphore1.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        };

        Thread th1 = new Thread(task1, "th1");
        Thread th2 = new Thread(task2, "th2");

        th1.start();
        th2.start();
    }

    public static void write(String text){
        System.out.print(text);
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
