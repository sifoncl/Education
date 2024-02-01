public class Main {
    public static void main(String[] args) throws MyArethmeticExeptions {
        try {
            devider(1, 0);
        } catch (ArithmeticException e) {
            throw new MyArethmeticExeptions("Неопределенность вида a/0");
        }
    }
    public static void devider(int a, int b) {
        System.out.println(a / b);
    }
}