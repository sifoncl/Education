import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<Integer> rndInt10 = () -> new Random().nextInt(0, 10);

        System.out.println(rndInt10.get());
    }
}