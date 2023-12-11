package Semaphore;

public class CaseTestRunner {
    public void run() throws InterruptedException {
        SharedResource sharedResource = new SharedResource(1);
        for (int i = 0; i < 100; i++) {
            Thread virtualThread = new Thread(new SemaphoreTestThread(sharedResource));
            Thread.startVirtualThread(virtualThread);
        }
    }
}
