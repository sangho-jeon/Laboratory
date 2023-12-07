package Semaphore;

public class SemaphoreTestThread implements Runnable{

    private SharedResource sharedResource;

    public SemaphoreTestThread(SharedResource sharedResource){
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