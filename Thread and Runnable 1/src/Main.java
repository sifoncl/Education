public class Main {
    public static void main(String[] args) {

        Thread thread1 = new RandomDigitsThread();
        thread1.start();

        Thread thread2 = new RandomDigitsThread();
        thread2.start();

        Thread thread3 = new RandomDigitsThread();
        thread3.start();

        Thread thread4 = new RandomDigitsThread();
        thread4.start();

        Thread thread5 = new RandomDigitsThread();
        thread5.start();

        Thread thread6 = new RandomDigitsThread();
        thread6.start();

        Thread thread7 = new RandomDigitsThread();
        thread7.start();

        Thread thread8 = new RandomDigitsThread();
        thread8.start();

        Thread thread9 = new RandomDigitsThread();
        thread9.start();

        Thread thread10 = new RandomDigitsThread();
        thread10.start();

    }
}