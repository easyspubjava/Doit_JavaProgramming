package thread;

class MyRunnable implements Runnable{

    public void run(){

        for(int j=0; j<200; j++){
            System.out.println(Thread.currentThread().getName()+":"+ j + "\t");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadTest {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "start");

        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();
        System.out.println(Thread.currentThread().getName() + "end");
    }
}
