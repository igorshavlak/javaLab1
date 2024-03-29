public class BreakThread implements Runnable{
    private boolean canBreak = false;
    private final int time;
    public BreakThread(int time) {
        this.time = time;

    }
    @Override
    public void run() {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        canBreak = true;
    }
    synchronized public boolean isCanBreak() {
        return canBreak;
    }
}