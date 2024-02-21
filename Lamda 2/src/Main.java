import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = -10;
        int c = 0;

        Function<Integer, String> negetivePositiveZeroCheck = x -> {
            if (x < 0) {
                return "Отрицательное число";
            }
            if (x > 0) {
                return "Положительное число";
            }
            return "Ноль";
        };

        System.out.println(negetivePositiveZeroCheck.apply(a));
        System.out.println(negetivePositiveZeroCheck.apply(b));
        System.out.println(negetivePositiveZeroCheck.apply(c));
    }
}