import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int n = 224;

        Integer b = Stream.iterate(2, i -> i <= n, i -> i + 2)
                .filter(i -> i > 10).findFirst().orElse(null);

        System.out.println(b);

    }
}