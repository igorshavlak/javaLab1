public class Main {
    public static void main(String[] args) {
        int numThreads = 7;

        BreakThread breakThread = new BreakThread(30);
        new Thread(breakThread).start();
        for (int i = 0; i < numThreads;i++) {
            Thread t = new MainThread(i,breakThread,2);
            t.start();

        }
    }
}
