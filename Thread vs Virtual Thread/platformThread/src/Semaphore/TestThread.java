package Semaphore;


public class ThreadRunner implements Runnable{

    private SharedResource sharedResource;

    public ThreadRunner(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            sharedResource.use();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
