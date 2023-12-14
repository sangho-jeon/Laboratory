package Semaphore;

import java.util.concurrent.ThreadFactory;

public class CaseTestRunner {
    public void run() throws InterruptedException {
        SharedResource sharedResource = new SharedResource(1);
        for (int i = 0; i < 100; i++) {
            Thread.Builder b = Thread.ofVirtual();
            ThreadFactory p = b.inheritInheritableThreadLocals(false).name("none").uncaughtExceptionHandler(new ExceptionHandler()).factory();
            Thread t = p.newThread(new SemaphoreTestThread(sharedResource));
            t.start();
        }
    }
}
