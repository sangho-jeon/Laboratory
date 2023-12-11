package Synchronized;

public class SyncCaseTestRunner {
    public void run() throws InterruptedException {
        SyncSharedResource sharedResource = new SyncSharedResource(1);
        for (int i = 0; i < 100; i++) {
            Thread virtualThread = new Thread(new SynchronizedTestThread(sharedResource));

            Thread.startVirtualThread(virtualThread);
        }
    }
}
