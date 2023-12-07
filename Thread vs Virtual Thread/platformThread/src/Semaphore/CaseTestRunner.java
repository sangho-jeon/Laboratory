package Semaphore;

public class CaseTestRunner {
    public void run(){
        SharedResource sharedResource = new SharedResource(5);
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new ThreadRunner(sharedResource));
            thread.start();
            System.out.println("thread in state " + thread.getState());
        }
    }
}
