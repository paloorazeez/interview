package multithread;
class JoinDemo2 extends Thread{
    static JoinDemo2 thread1;

    public void run(){
        try{
            synchronized(thread1){
                System.out.println(Thread.currentThread().getName()+" acquired a lock on thread1");
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName()+" completed");
            }
        }
        catch (InterruptedException e){ }
    }

    public static void main(String[] ar) throws Exception{
        thread1 = new JoinDemo2();
        thread1.setName("thread1");
        thread1.start();

        synchronized(thread1){
            System.out.println(Thread.currentThread().getName()+" acquired a lock on thread1");
            Thread.sleep(1000);
            thread1.join();
            System.out.println(Thread.currentThread().getName()+" completed");
        }
    }
}
