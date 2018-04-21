package BucketThreads;

public class Consument  extends Thread{

    private Bucket bucket;
    private String name;

    public Consument(String name, Bucket bucket) {
        this.name = name;
        this.bucket = bucket;
    }


    public void run() {


        while(!isInterrupted()) {

            try {
                synchronized (bucket) {
                    bucket.getProduct();
                    bucket.wait();
                    System.out.println(ThreadColor.ANSI_BLUE +  name + " kupuje produkt nr: " + bucket.getProduct());
                    this.sleep(1000);
                    bucket.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("watek zostal zatrzymany");
            }


        }
    }


}
