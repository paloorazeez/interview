package multithread;

public class ExceptionHandlers {

    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("HIIIIIII");
            }
        };

        ThreadGroup tg = new ThreadGroup("ThreadGroup1"){

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("ThreadGroup "+t.getName()+ " "+e.getMessage());
            }
        };

        Thread t1 = new Thread(tg,r1);
        /*t1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler()
        {

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(t.getName()+" "+e.getMessage());
            }
        });*/
        t1.start();

        /*Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Default:"+ t.getName()+" "+e.getMessage());
            }
        });*/

        Thread t2 = new Thread(r1);
        t2.start();


    }
}
