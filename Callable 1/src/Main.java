import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Future<ArrayList<File>>> allFilesAsFutures = new ArrayList<>();
        ArrayList<File> allFiles = new ArrayList<>();

        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            FileGenerator fileGenerator = new FileGenerator();
            Future<ArrayList<File>> future = pool.submit(fileGenerator);
            allFilesAsFutures.add(future);
        }
        for (Future<ArrayList<File>> f : allFilesAsFutures) {
            allFiles.addAll(f.get());

        }
        pool.shutdown();
        System.out.println(allFiles);
    }
}