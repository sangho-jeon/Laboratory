package ReentrantLock;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantSharedResource {
    private ReentrantLock reentrantLock;
    private int counter;

    public ReentrantSharedResource(int cnt) {
        this.reentrantLock = new ReentrantLock();
        this.counter = 0;
    }

    public void use() throws InterruptedException {
        System.out.println(Thread.currentThread().threadId() + " entering in state " + Thread.currentThread().getState());
        System.out.println("Getting In thread no: " + Thread.currentThread().threadId() + " state: " + Thread.currentThread().getState());
        System.out.println("queue waiting: " + reentrantLock.getQueueLength());
        reentrantLock.lock();
        doUse();
        reentrantLock.unlock();
    }

    private synchronized void doUse() throws InterruptedException {
        System.out.println("count: " + counter++);
        System.out.println("After thread no: " + Thread.currentThread().threadId() + " state: " + Thread.currentThread().getState());
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        Thread.sleep(1000);
    }
}
