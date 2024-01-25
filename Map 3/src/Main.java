import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "aaddccaaddeeddfffaa";


        System.out.println(getCharsCount(str));
    }

    public static Map<Character, Integer> getCharsCount(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> charsCount = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (charsCount.containsKey(chars[i])) {
                charsCount.put(chars[i], charsCount.get(chars[i]) + 1);
            } else charsCount.put(chars[i], 1);
        }
        return charsCount;
    }
}