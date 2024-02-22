import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int n = 25;
        int minValue = 1;
        int maxValue = 100;

        boolean randomCount = Stream.generate(() -> new Random().nextInt(minValue, maxValue))
                .limit(n).anyMatch(x -> x % 15 == 0);

        System.out.println(randomCount);
    }
}