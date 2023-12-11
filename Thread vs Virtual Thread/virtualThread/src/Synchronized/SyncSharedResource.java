package Synchronized;

import java.util.Arrays;

public class SyncSharedResource {
    private int counter;

    public SyncSharedResource(int cnt) {
        this.counter = 0;
    }

    public void use() throws InterruptedException {
        System.out.println(Thread.currentThread().threadId() + " entering in state " + Thread.currentThread().getState());
        System.out.println("Getting In thread no: " + Thread.currentThread().threadId() + " state: " + Thread.currentThread().getState() );
        doUse();
    }

    private synchronized void doUse() throws InterruptedException {
        System.out.println("count: " + counter++);
        System.out.println("After thread no: " + Thread.currentThread().threadId() + " state: " + Thread.currentThread().getState() );
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        Thread.sleep(1000);
    }
}
