import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        String strDir = "G:/";
        for (int i = 0; i < 3; i++) {
            strDir += "/test";
            File f = new File(strDir);
            f.mkdir();
        }

        Random rnd = new Random();

        File dir = new File(strDir);

        File f1 = new File(dir, getRndString(2, 7) + ".txt");
        f1.createNewFile();
        File f2 = new File(dir, getRndString(2, 7) + ".txt");
        f2.createNewFile();
        File f3 = new File(dir, getRndString(2, 7) + ".txt");
        f3.createNewFile();
        File f4 = new File(dir, getRndString(2, 7) + ".txt");
        f4.createNewFile();
        File f5 = new File(dir, getRndString(2, 7) + ".txt");
        f5.createNewFile();

        File[] files = {f1, f2, f3, f4, f5};

        File all = new File(dir, "all.txt");
        all.createNewFile();

        File catalog = new File(dir, "catalog.txt");
        catalog.createNewFile();

        try (FileWriter allWriter = new FileWriter(all)) {
            for (File f : files) {
                try (FileWriter writer = new FileWriter(f)) {
                    for (int i = 0; i < 10; i++) {
                        String nextInt = String.valueOf(rnd.nextInt()) + " ";
                        writer.write(nextInt);
                        allWriter.write(nextInt);
                    }
                    allWriter.write("\n");
                } catch (RuntimeException e) {
                }
            }
            try (FileWriter catalogWriter = new FileWriter(catalog)) {
                for (File f : dir.listFiles()) {
                    catalogWriter.write(f.getName() + "\n");
                }
            }


        }
    }

    public static String getRndString(int minLength, int maxLength) {
        Random rnd = new Random();
        char[] array = new char[rnd.nextInt(minLength, maxLength)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) rnd.nextInt(97, 122);
        }
        return String.valueOf(array);
    }
}