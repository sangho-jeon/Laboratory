package ReentrantLock;

import Semaphore.ExceptionHandler;

import java.util.concurrent.ThreadFactory;

public class ReentrantCaseTestRunner {
    public void run() throws InterruptedException {
        ReentrantSharedResource sharedResource = new ReentrantSharedResource(1);
        for (int i = 0; i < 100; i++) {
            Thread.Builder b = Thread.ofVirtual();
            ThreadFactory p = b.inheritInheritableThreadLocals(false).name("none").uncaughtExceptionHandler(new ExceptionHandler()).factory();
            Thread t = p.newThread(new SemaphoreTestThread(sharedResource));
            t.start();
        }
    }
}
