import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Numbers {

    private LinkedList<Integer> nums = new LinkedList<Integer>();

    private int counter = 0;

    public synchronized void add() {
        while (nums.size() > 100) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        Random rnd = new Random();
        nums.add(rnd.nextInt(0, 100));
        System.out.println(Thread.currentThread().getName() + " добавил, Сейчас чисел " + nums.size());
        if (nums.size() < 80) {
            notify();
        }
    }

    public int getCounter() {
        return counter;
    }

    public synchronized void get() {
        while (nums.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        nums.removeFirst();
        counter++;
        System.out.println(Thread.currentThread().getName() + " убрал, Сейчас чисел " + nums.size() + "всего забрали " + counter);
        if (counter == 10000) {
            System.out.println("Хватит работать");
            System.exit(0);
        }
        notify();
    }

    public synchronized LinkedList<Integer> getNums() {
        return nums;
    }
}
