package Semaphore;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class SyncSharedResource {
    private final Semaphore semaphore;
    private int counter;

    public SyncSharedResource(int cnt) {
        this.semaphore = new Semaphore(cnt);
        this.counter = 0;
    }

    public void use() throws InterruptedException {
        System.out.println(Thread.currentThread().threadId() + " entering in state " + Thread.currentThread().getState());
        semaphore.acquire(); // 세마포어 리소스 확보4
        System.out.println("Getting In thread no: " + Thread.currentThread().threadId() + " state: " + Thread.currentThread().getState() );
//        doUse();
        try {
            doUse();
        } finally {
            semaphore.release(); // 세마포어 리소스 해제
        }
    }

    private synchronized void doUse() throws InterruptedException {
        System.out.println("count: " + counter++);
        System.out.println("After thread no: " + Thread.currentThread().threadId() + " state: " + Thread.currentThread().getState() );
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
//        Thread.sleep(1000);
    }
}
