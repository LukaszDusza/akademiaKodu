package threads;

public class Main {

    //urucomienie wątku głównego.
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_BLUE + "Hello world " + Thread.currentThread().getName() );


        Countdown countdown = new Countdown();

        CountDawnThread t1 = new CountDawnThread(countdown);
        t1.setName("Thread 1");
        CountDawnThread t2 = new CountDawnThread(countdown);
        t2.setName("thread 2");


        //urachamianie wątków potomne.
        t1.start();
        t2.start();

//        try {
//            Thread.sleep(25000);
//            System.out.println("koniec watka main");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("koniec watka main");

    }

}


class Countdown {
private int i;
public void doCaountdown() {
        String color;

        switch(Thread.currentThread().getName()) {
        case "Thread 1":
        color = ThreadColor.ANSI_CYAN;
        break;
        case "Thread 2":
        color = ThreadColor.ANSI_PURPLE;
        break;

default: color = ThreadColor.ANSI_GREEN;
        }

        for ( i = 10; i > 0 ; i--) {
        System.out.println(color + Thread.currentThread().getName() + ": " + i );
        }

          }

    public /*synchronized*/ void doCaountdownSynchro() {
        String color;

        switch(Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;

            default: color = ThreadColor.ANSI_GREEN;
        }

        synchronized (this) {
            for ( i = 10; i > 0 ; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": " + i );
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }

        }


class CountDawnThread extends Thread {
    private Countdown threadCountdown;

    public CountDawnThread(Countdown countDawn) {
        threadCountdown = countDawn;
    }

    public void run() {
     //   threadCountdown.doCaountdown();
        threadCountdown.doCaountdownSynchro();
    }
}
