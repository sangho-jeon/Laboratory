public class PlatformThread implements Runnable{
    int threadNum;

    public PlatformThread(int num){
        this.threadNum = num;
    }

    @Override
    public void run() {
        System.out.println("platform Thread"+ threadNum +"running!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
