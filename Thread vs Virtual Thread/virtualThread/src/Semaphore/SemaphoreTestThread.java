package Semaphore;

public class SemaphoreTestThread implements Runnable{

    private SyncSharedResource sharedResource;

    public SemaphoreTestThread(SyncSharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {

        System.out.println("virtual thread name " + Thread.currentThread().threadId());
        System.out.println("virtual thread is virtual " + Thread.currentThread().isVirtual());
        System.out.println("virtual thread state " + Thread.currentThread().getState());
        System.out.println(Thread.currentThread().toString());
        try {
            sharedResource.use();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}