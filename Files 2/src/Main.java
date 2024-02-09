import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        File textFile = new File("G:\\testText.txt");
        try (FileReader fileInputStream = new FileReader(textFile);
             BufferedReader reader = new BufferedReader(fileInputStream)) {
            boolean hasToRead = true;
            while (hasToRead) {
                String tempStr = reader.readLine();
                if (tempStr != null) {
                    str.append(tempStr);
                    str.append("\n");
                } else {
                    hasToRead = false;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(str);
        Pattern punct = Pattern.compile("\\p{Punct}");
        Matcher matcherPunct = punct.matcher(str);
        int counterPunct = 0;
        while (matcherPunct.find()) {
            counterPunct++;
        }
        System.out.println("В тексте: " + counterPunct + " занаков препинания");

        Pattern word = Pattern.compile("\\b[A-Za-zА-Яa-яё0-9]+\\b", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcherWord = word.matcher(str);
        int counterWords = 0;
        while (matcherWord.find()) {
            counterWords++;
        }
        System.out.println("В тексте: " + counterWords + " слов");
    }
}