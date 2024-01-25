import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        HashMap<Integer, String> roamanDigits = new HashMap<>();
        roamanDigits.put(1, "I");
        roamanDigits.put(4, "IV");
        roamanDigits.put(5, "V");
        roamanDigits.put(9, "IX");
        roamanDigits.put(10, "X");
        roamanDigits.put(40, "XL");
        roamanDigits.put(50, "L");
        roamanDigits.put(90, "XC");
        roamanDigits.put(100, "C");
        roamanDigits.put(400, "CD");
        roamanDigits.put(500, "D");
        roamanDigits.put(900, "CM");
        roamanDigits.put(1000, "M");

        Scanner sc = new Scanner(System.in);
        int arabic = sc.nextInt();


        StringBuilder roman = new StringBuilder("");
        while (arabic != 0) {

            if (arabic >= 1000) {
                roman.append(roamanDigits.get(1000));
                arabic = arabic - 1000;

                continue;
            }
            if (arabic >= 900) {
                roman.append(roamanDigits.get(900));
                arabic = arabic - 900;
                continue;
            }
            if (arabic >= 500) {
                roman.append(roamanDigits.get(500));
                arabic = arabic - 500;
                continue;
            }

            if (arabic >= 400) {
                roman.append(roamanDigits.get(400));
                arabic = arabic - 400;
                continue;
            }

            if (arabic >= 100) {
                roman.append(roamanDigits.get(100));
                arabic = arabic - 100;
                continue;
            }
            if (arabic >= 90) {
                roman.append(roamanDigits.get(90));
                arabic = arabic - 90;
                continue;
            }
            if (arabic >= 50) {
                roman.append(roamanDigits.get(50));
                arabic = arabic - 50;
                continue;
            }
            if (arabic >= 40) {
                roman.append(roamanDigits.get(40));
                arabic = arabic - 40;
                continue;
            }
            if (arabic >= 10) {
                roman.append(roamanDigits.get(10));
                arabic = arabic - 10;
                continue;
            }

            if (arabic >= 9) {
                roman.append(roamanDigits.get(9));
                arabic = arabic - 9;
                continue;
            }

            if (arabic >= 5) {
                roman.append(roamanDigits.get(5));
                arabic = arabic - 5;
                continue;
            }


            if (arabic >= 4) {
                roman.append(roamanDigits.get(4));
                arabic = arabic - 4;
                continue;
            }
            if (arabic >= 1) {
                roman.append(roamanDigits.get(1));
                arabic = arabic - 1;
                continue;
            }

            System.out.println(arabic);
            System.out.println(roman);

        }
        System.out.println(roman);
    }
}