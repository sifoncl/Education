public class Main {
    public static void main(String[] args) {
        Thread[] myThreads = new Thread[10];
        for (Thread t : myThreads) {
            t = new TheredSleep();
            t.start();
        }
    }
}