package Semaphore;

import java.util.concurrent.Semaphore;

public class SharedResource {
    private final Semaphore semaphore;
    private final int MAX_PERMIT_CNT;
    private int counter;

    public SharedResource(int cnt) {
        this.semaphore = new Semaphore(cnt);
        this.MAX_PERMIT_CNT = cnt;
        this.counter = 0;
    }

    public void use() throws InterruptedException {
        semaphore.acquire(); // 세마포어 리소스 확보
        System.out.println("thread no " + Thread.currentThread().getId() + " got access");
        try {
            doUse();
        } finally {
            semaphore.release(); // 세마포어 리소스 해제
        }
    }

    private void doUse() throws InterruptedException {
        System.out.println(counter++);
        Thread.sleep(1000);
    }
}
