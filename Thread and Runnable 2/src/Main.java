public class Main {
    public static void main(String[] args) {

Thread[] myWriters = {new FileWriteRndDigitsThread(),new FileWriteRndDigitsThread(),new FileWriteRndDigitsThread(),
        new FileWriteRndDigitsThread(),new FileWriteRndDigitsThread()};
        for (Thread t:myWriters) {
            t.start();
        }
    }
}