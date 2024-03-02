public class SomeMethods {

    private int someInt;

    @AcademyInfo(year = 2024)
    public static void printer(String str) {
        System.out.println(str);
    }

    @AcademyInfo(year = 2023)
    public static int sum(int a, int b) {
        return a + b;
    }

    @AcademyInfo(year = 2022)
    public int getSomeInt() {
        return someInt;
    }
}
