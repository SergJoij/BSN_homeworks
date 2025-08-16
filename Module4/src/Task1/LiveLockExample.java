package Task1;

public class LiveLockExample {
    static Integer total = 5;


    public static void main(String[] args){

        Runnable task1 = () -> {
            while (true)
                if (total <= 5) {
                    System.out.print("Thread " + Thread.currentThread().getName() + ", total was " + total);
                    total++;
                    System.out.println(", total became " + total);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
                else {
                    System.out.println("Thread " + Thread.currentThread().getName() + ", total is " + total);
                    break;
                }
        };

        Runnable task2 = () -> {
            while (true)
                if (total >= 5) {
                    System.out.print("Thread " + Thread.currentThread().getName() + ", total was " + total);
                    total--;
                    System.out.println(", total became " + total);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
                else {
                    System.out.println("Thread " + Thread.currentThread().getName() + ", total is " + total);
                    break;
                }
        };

        Thread th1 = new Thread(task1, "th1");
        Thread th2 = new Thread(task2, "th2");

        th1.start();
        th2.start();
    }
}
