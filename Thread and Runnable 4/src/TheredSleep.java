public class TheredSleep extends Thread {

    private static Object sync = new Object();

    public void run() {
        synchronized (sync) {
            System.out.println(this.getName());
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
