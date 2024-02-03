public class Main {
    public static void main(String[] args) {
        try {
        int ansver = devider(1, 0);
            System.out.println(ansver);
        } catch (ArithmeticException e) {
            System.out.println("Нельязя делить на 0");
        }
    }

    public static int devider(int a, int b) throws ArithmeticException {
        return a / b;
    }

}



