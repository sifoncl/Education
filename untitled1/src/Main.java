import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String userStr = "Петя, 345, 2024-02-10";


        System.out.println(userStr.matches("\\b.+\\b,\s+[0-9]+,\s+[0-9]{4}-[0-9]{2}-[0-9]{2}"));
    }
}