import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 10, 12, 14, 19, 24, 25, 223233};

        int first = Arrays.stream(nums).filter(x -> x >= 24).findFirst().getAsInt();

        System.out.println(first);

    }


}