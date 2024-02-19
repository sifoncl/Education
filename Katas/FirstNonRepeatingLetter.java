package Katas;

import java.util.*;

public class FirstNonRepeatingLetter {

    public static void main(String[] args) {

        String str = "moonemooneLl";
        System.out.println(firstNonRepeatingLetter(str));
    }

    public static String firstNonRepeatingLetter(String s) {
        if (s.length() == 1) {
            return s;
        }

        String strLow = s.toLowerCase();
        char[] str = strLow.toCharArray();

        LinkedHashMap<Character, Integer> characterCounter = new LinkedHashMap<>();
        for (char c : str) {
            int tempValue = 0;
            if (characterCounter.get(c) != null) {
                tempValue = characterCounter.get(c) + 1;
            } else tempValue = 1;
            characterCounter.put(c, tempValue);
        }
        System.out.println(characterCounter);
        ArrayList<Character> unicChars = new ArrayList<>(0);
        for (Map.Entry<Character, Integer> entry : characterCounter.entrySet()) {
            if (entry.getValue() == 1) {
                unicChars.add(entry.getKey());
            }
            System.out.println(unicChars);
            for (int i = 0; i < str.length; i++) {
                for (Character ch : unicChars) {
                    if (str[i] == ch) {
                        return String.valueOf(s.charAt(i));
                    }
                }
            }
        }


        return "";
    }

}
