public class MainThread extends Thread{
    private final int id;
    private final BreakThread breakThread;
    private final int step;

    public MainThread(int id, BreakThread breakThread, int step) {
        this.id = id;
        this.breakThread = breakThread;
        this.step = step;
    }


    @Override
    public void run() {
        long sum = 0;
        int i = 0;
        int current = 0;
        boolean isStop = false;
        while(!isStop) {
            sum += current;
            i++;
            current += step;
            isStop = breakThread.isCanBreak();
        }
        System.out.println(id + ". " + "count - " + i + ", sum - " + sum);
    }
}