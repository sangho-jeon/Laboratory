package Util;

import ReentrantLock.ReentrantSharedResource;

public class BasicThreadRunner {
    ThreadFactory factory;
    ReentrantSharedResource resource;
    public BasicThreadRunner(ThreadFactory factory, ReentrantSharedResource resource){
        this.factory = factory;
        this.resource = resource;
    }
    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Thread thread = factory.createThread();
            thread.start();
            thread.join();
        }
    }
}
