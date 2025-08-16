package Task1;

public class DeadLockExample {
    public static void main(String[] args){
        First first = new First();
        First nextFirst = new First();

        Runnable task1 = () -> {
            first.selfOperation(nextFirst);
        };
        Runnable task2 = () -> {
            nextFirst.selfOperation(first);
        };

        Thread th1 = new Thread(task1, "th1");
        Thread th2 = new Thread(task2, "th2");

        th1.start();
        th2.start();
    }


    static class First{
        public String getClassName(){
            return new Object(){}.getClass().getEnclosingClass().getSimpleName();
        }

        public synchronized void selfOperation(First obj){
            System.out.println("Start operation " + getClassName() + " by " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " has come to the execution of the obj end");
            obj.endOfOperation(false);
            endOfOperation(true);
        }

        public synchronized void endOfOperation(boolean state){
            if (state)
                System.out.println("End operation by " + Thread.currentThread().getName());
            else
                System.out.println("Thread " + Thread.currentThread().getName() + "going to " +
                        getClassName());
        }
    }
}
