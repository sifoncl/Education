import java.util.LinkedList;
import java.util.Random;

public class Generator extends Thread {

    private static LinkedList<Integer> integerList = new LinkedList<Integer>();

    public void run() {
        Random rnd = new Random();
        while (integerList.size() < 100) {
            integerList.add(rnd.nextInt(0, 100));
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Generator.printSize();
        }
    }

    public static void printSize() {
        System.out.println(integerList.size());
    }

}
