import java.util.LinkedList;
import java.util.Random;

public class Generator extends Thread {

    private LinkedList<Integer> integerList;

    public Generator(LinkedList<Integer> integerList) {
        this.integerList = integerList;
    }

    public void run() {
        Random rnd = new Random();
        while (this.integerList.size() < 100) {
            this.integerList.add(rnd.nextInt(0, 100));
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " Добавил");
        }
    }

}
