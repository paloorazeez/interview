package multithread;

import java.util.LinkedList;
import java.util.List;

public class WaitAndNotify {

    public static void main(String[] args) {

        ProducerConsumer pc = new ProducerConsumer();

        new Thread(new Runnable(){

            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable(){

            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}

class ProducerConsumer{

    LinkedList<Integer> list = new LinkedList<>();
    int value =0;
    int capacity = 2;

    public void produce() throws InterruptedException {

        while (true)
        {
            synchronized (this)
            {
                if(list.size() == capacity) {
                        wait();
                }

                System.out.println("Producer: "+value);
                list.add(value++);

                notify();

                Thread.sleep(1000);
            }

        }
    }

    public void consume() throws InterruptedException {
        while(true)
        {
            synchronized (this)
            {
                if(list.size() == 0)
                    wait();
                System.out.println("Consumer: "+list.removeFirst());

                notify();

                Thread.sleep(1000);
            }
        }
    }
}