import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fW = new FileWriter("G:\\Test.txt");
        ReentrantLock loker = new ReentrantLock();

        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            pool.execute(new FileWriters(loker, fW));
        }

        pool.shutdown();

    }
}