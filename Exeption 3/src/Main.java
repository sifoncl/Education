public class Main {
    public static void main(String[] args) {
        try {
            devider(1, 0);
        } catch (RuntimeException e) {
            System.out.println("Нельязя делить на 0");;
        }
    }
    public static void devider(int a, int b) {
        System.out.println(a / b);
    }
}