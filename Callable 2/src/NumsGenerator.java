import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;

public class NumsGenerator implements Callable {
    @Override
    public ArrayList<Integer> call() throws Exception {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(new Random().nextInt(0, 1000));
        }
        Thread.sleep(new Random().nextInt(1000, 10000));
        return nums;
    }
}
