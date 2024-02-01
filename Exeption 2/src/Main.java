public class Main {
    public static void main(String[] args) throws MyArethmeticExeptions {

        int a = 1;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            throw new MyArethmeticExeptions("Неопределенность вида a/0");
        }

    }
}