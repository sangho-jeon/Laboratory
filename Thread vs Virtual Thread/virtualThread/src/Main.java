// openJDK 21

import ReentrantLock.ReentrantCaseTestRunner;
import Semaphore.CaseTestRunner;
import Synchronized.SyncCaseTestRunner;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        CaseTestRunner caseTestRunner = new CaseTestRunner();
//        caseTestRunner.run();
        ReentrantCaseTestRunner reentrantCaseTestRunner = new ReentrantCaseTestRunner();
        reentrantCaseTestRunner.run();
        Thread.sleep(100000);
    }
}
