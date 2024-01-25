import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine();

        char[] romanChars = roman.toCharArray();

        Map<Character, Integer> roamanDigits = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

        int arabic = 0;

        for (int i = 0; i <= romanChars.length - 1; i++) {
            if (i == romanChars.length - 1) {
                arabic = arabic + roamanDigits.get(romanChars[i]);
            } else if (roamanDigits.get(romanChars[i]) >= roamanDigits.get(romanChars[i + 1])) {
                arabic = arabic + roamanDigits.get(romanChars[i]);
            } else if (roamanDigits.get(romanChars[i]) < roamanDigits.get(romanChars[i + 1])) {
                arabic = arabic - roamanDigits.get(romanChars[i]);

            }
        }
        System.out.println(arabic);

    }
}