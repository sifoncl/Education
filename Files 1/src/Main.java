import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String dirString = scn.nextLine();

        File dir = new File(dirString);
        System.out.println("Папки: ");
        for (File f : dir.listFiles()) {
            if (f.isDirectory()) {
                System.out.println(f.getName());
            }
        }
        System.out.println("Файлы: ");
        for (File f : dir.listFiles()) {
            if (f.isFile()) {
                System.out.println(f.getName());
            }
        }
    }
}