public class VirtualThread implements Runnable {
    int threadNum;

    public VirtualThread(int num){
        this.threadNum = num;
    }

    @Override
    public void run() {
        try {
            System.out.println("virtual Thread"+ threadNum +"running!");
            System.out.println(Thread.currentThread().isVirtual());
            Thread.sleep(1000);
            System.out.println("Thread " + threadNum + " has ended");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
