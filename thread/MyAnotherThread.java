package thread;

public class MyAnotherThread extends Thread {
    
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread loop " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyAnotherThread t2 = new MyAnotherThread();
        t2.start();
        
    }
}
