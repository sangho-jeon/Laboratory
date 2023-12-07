package Semaphore;

import java.util.concurrent.Semaphore;

public class SharedResource {
    private final Semaphore semaphore;
    private final int MAX_PERMIT_CNT;

    public SharedResource(int cnt) {
        this.semaphore = new Semaphore(cnt);
        this.MAX_PERMIT_CNT = cnt;
    }

    public void use() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " / available resource count = " + (semaphore.availablePermits()));
        semaphore.acquire(); // 세마포어 리소스 확보
        try {
            doUse();
        } finally {
            semaphore.release(); // 세마포어 리소스 해제
        }
    }

    private void doUse() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " / Finish Time : ");
    }
}
