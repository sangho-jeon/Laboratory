// java 1.8

import Semaphore.CaseTestRunner;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        long currentTime = System.currentTimeMillis();
//        ArrayList<Thread> threadPool = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            Thread platformThread = new Thread(new PlatformThread(i));
//            platformThread.start();
//            threadPool.add(platformThread);
//        }
//
//        for (Thread platformThread:
//             threadPool) {
//            try{
//            platformThread.join();
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        }
//
//        long endTime = System.currentTimeMillis();
//        System.out.println("process stopped in " + (endTime - currentTime));

        CaseTestRunner caseSemaphore = new CaseTestRunner();
        caseSemaphore.run();

    }
}
