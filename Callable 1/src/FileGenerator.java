import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class FileGenerator implements Callable {
    @Override
    public ArrayList<File> call() throws Exception {
        ArrayList<File> myFiles = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            File file = new File("G:\\" + (Thread.currentThread().getName() + " " + i + ".txt"));
            myFiles.add(file);
            try (BufferedWriter bow =
                         new BufferedWriter(new FileWriter(file))) {
                bow.write("я случайная строка!!!" + Thread.currentThread().getName() + " " + i);

            }
        }
        Thread.sleep(new Random().nextInt(1000, 3000));
        return myFiles;
    }
}
