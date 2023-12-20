package ReentrantLock;

public class SemaphoreTestThread implements Runnable{

    private ReentrantSharedResource reentrantSharedResource;

    public SemaphoreTestThread(ReentrantSharedResource sharedResource){
        this.reentrantSharedResource = sharedResource;
    }

    @Override
    public void run() {

        System.out.println("virtual thread name " + Thread.currentThread().threadId());
        System.out.println("virtual thread is virtual " + Thread.currentThread().isVirtual());
        System.out.println("virtual thread state " + Thread.currentThread().getState());
        System.out.println(Thread.currentThread().toString());
        try {
            reentrantSharedResource.use();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}