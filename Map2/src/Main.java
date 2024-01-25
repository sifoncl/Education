import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        text.toLowerCase();
        text.trim();
        text.replaceAll("\\p{Punct}", " ");

        String[] words;
        words = text.split(" +");

        HashMap<String, Integer> wordsCount = new HashMap<>();


        for (int i = 0; i < words.length; i++) {
            if (wordsCount.containsKey(words[i])) {
                wordsCount.put(words[i], wordsCount.get(words[i]) + 1);

            } else wordsCount.put(words[i], 1);

        }
        System.out.println(wordsCount);

    }
}