// openJDK 21

import Semaphore.CaseTestRunner;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        ArrayList<Thread> threadPool = new ArrayList<>();
//        long currentTime = System.currentTimeMillis();
//        for (int i = 0; i < 10; i++) {
//            Thread virtualThread = new Thread(new VirtualThread(i));
//            System.out.println("vThread " + i + " is in state " + virtualThread.getState());
//            Thread.startVirtualThread(virtualThread);
//            System.out.println("vThread " + i + " is in state " + virtualThread);
//            threadPool.add(virtualThread);
//        }
//
//        for (Thread virtualThread:
//                threadPool) {
//            try{
//                virtualThread.join();
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        }
//
//        long endTime = System.currentTimeMillis();
//
//        Thread.sleep(10000);
//        System.out.println("process stopped in " + (endTime - currentTime));
        CaseTestRunner caseTestRunner = new CaseTestRunner();
        caseTestRunner.run();
    }
}
