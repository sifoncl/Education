import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] inch = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println(Arrays.stream(inch).filter(x -> x % 2 == 0).peek(x->System.out.println(x))
                .map(x -> x * 2.54).peek(x->System.out.println(x)).sum());


    }
}