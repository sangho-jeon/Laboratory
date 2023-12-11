// openJDK 21

import Semaphore.CaseTestRunner;
import Synchronized.SyncCaseTestRunner;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread name " + Thread.currentThread().getName());
        System.out.println("main thread is virtual " + Thread.currentThread().isVirtual());
        System.out.println("main thread state " + Thread.currentThread().getState());
        System.out.println(Thread.currentThread().toString());
//        SyncCaseTestRunner syncCaseTestRunner = new SyncCaseTestRunner();
//        syncCaseTestRunner.run();
        CaseTestRunner caseTestRunner = new CaseTestRunner();
        caseTestRunner.run();
        Thread.sleep(100000000);
        System.out.println("dead?");
        Thread.sleep(100000000);
    }
}
