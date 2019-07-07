package multithread;

public class JoinExample1 {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadTask());
        t1.start();
        Thread t2 = new Thread(new ThreadTask(t1));
        t2.start();
        Thread t3 = new Thread(new ThreadTask(t2));
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread()+" ended");

    }
}

class ThreadTask implements Runnable{

    public ThreadTask()
    {

    }

    public ThreadTask(Thread thread) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println(Thread.currentThread()+" =>"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
