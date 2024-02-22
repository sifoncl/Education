import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream.generate(() -> (Integer) new Random().nextInt(1, 10))
                .limit(100).filter(x -> x % 2 == 0).map(String::valueOf).collect(Collectors.toSet())
                .stream().forEach(System.out::println);
    }
}