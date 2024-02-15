import java.util.Random;

public class RandomDigitsThread extends Thread {

    public void run() {
        Random rnd = new Random();
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = rnd.nextInt(0, 100);
        }
        int max = nums[0];
        for (int i = 1; i < 10; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println("Имя патока:" + this.getName() + " Максимальное число: " + max);
    }
}
