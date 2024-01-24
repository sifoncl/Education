import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> digits = new ArrayList<>();
        Random rnd = new Random();
        Integer rndDigit = rnd.nextInt(20);

        for (int i = 0; i < 20; i++) {
            digits.add(rndDigit = rnd.nextInt(1, 10));

        }
        System.out.println(digits);

        Set<Integer> digitSet = new TreeSet<>(digits);

        System.out.println(digitSet);
    }
}