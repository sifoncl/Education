import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Так долго потому, что потоки спят от 1 до 10 сек");

        List<Future<ArrayList<Integer>>> allNumsAsFutures = new ArrayList<>();
        ArrayList<Integer> allNums = new ArrayList<>();

        int result = 0;

        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            NumsGenerator numsGenerator = new NumsGenerator();
            Future<ArrayList<Integer>> future = pool.submit(numsGenerator);
            allNumsAsFutures.add(future);
        }
        for (Future<ArrayList<Integer>> f : allNumsAsFutures) {
            allNums.addAll(f.get());

        }
        for (Integer n : allNums) {
            result += n;
        }

        System.out.println("Ну наконец-то!!! "+result);
        pool.shutdown();
    }
}