import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileWriteRndDigitsThread extends Thread {

    public void run() {
        Random rnd = new Random();
        try (FileWriter fileWriter = new FileWriter("G:/" + this.getName() + ".txt")) {
            for (int i = 0; i < 10; i++) {
                fileWriter.write(rnd.nextInt(0, 100) + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


