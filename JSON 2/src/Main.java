import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scn = new Scanner(System.in);
        int id = scn.nextInt();

        Colors colors = null;

        byte[] jsonData = Files.readAllBytes(Paths.get("JSON 2/json.json"));
        ObjectMapper objectMapper = new ObjectMapper();
        colors = objectMapper.readValue(jsonData, Colors.class);

        System.out.println(colors);

        String color = colors.getColorById(id);

        String ansiColor = colorFromNameToAnsi(color);

        System.out.println(ansiColor + "Мой любимый цвет");
    }

    public static String colorFromNameToAnsi(String color) {
        switch (color) {
            case "black":
                return "\u001B[30m";
            case "red":
                return "\u001B[31m";
            case "green":
                return "\u001B[32m";
            case "yellow":
                return "\u001B[33m";
            case "blue":
                return "\u001B[34m";
            case "cyan":
                return "\u001B[36m";
            case "magenta":
                return "\u001B[35m";
            default:
                return "\u001B[35m";
        }
    }


}