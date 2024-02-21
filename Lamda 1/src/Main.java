import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<String> isNull = x -> x != null;

        String str1 = null;
        String str2 = "22";

        isNull.test(str1);


        System.out.println(isNull.test(str1));
        System.out.println(isNull.test(str2));

        Predicate<String> isNotEmpty = x -> x.length() > 0;

        String str3 = "";
        String str4 = "Lamda";

        System.out.println(isNotEmpty.test(str3));
        System.out.println(isNotEmpty.test(str4));

        Predicate<String> jnaCheck = x -> (x.startsWith("J") || x.startsWith("N")) && x.endsWith("A");

        String str5 = "JasdsadA";
        String str6 = "sadsA";
        String str7 = "NdasdA";

        System.out.println(jnaCheck.test(str5));
        System.out.println(jnaCheck.test(str6));
        System.out.println(jnaCheck.test(str7));
    }
}