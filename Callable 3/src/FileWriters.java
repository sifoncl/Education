import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.PrimitiveIterator;
import java.util.concurrent.locks.ReentrantLock;

public class FileWriters implements Runnable {

    private ReentrantLock loker;
    private FileWriter fW;
    private int counter = 0;

    public FileWriters(ReentrantLock loker, FileWriter fW) {
        this.loker = loker;
        this.fW = fW;
    }

    @Override
    public void run() {
        while (counter < 100) {
            loker.lock();
            try {
                fW.write("Hellow world!!!" + LocalDateTime.now() + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            counter++;

            System.out.println(Thread.currentThread().getName() + " Записал ");
            loker.unlock();
        }

    }

}
