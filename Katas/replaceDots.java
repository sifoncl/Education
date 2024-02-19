package Katas;

public class replaceDots {

    public static void main(String[] args) {
        System.out.println(replaceDots(".2...11dd..qq"));
    }

    public static String replaceDots(final String str) {
        String stringi = str;

        return stringi.replaceAll("\\.", "-");
    }


}
