import java.time.LocalDateTime;
import java.util.Random;

public class BouquetJenerator {

    public static void printBouquet(int flowersCount, Flower[] avalibleFlowers) {
        Random rn = new Random();
        Flower[] bouquet = new Flower[flowersCount];
        for (int i = 0; i < flowersCount; i++) {
            int randomNum = rn.nextInt(avalibleFlowers.length - 1 + 1);
            bouquet[i] = avalibleFlowers[randomNum];
        }
        for (int i = 0; i < bouquet.length; i++) {
            System.out.println(bouquet[i].toString());
        }
        LocalDateTime lastDay = bouquet[0].getExpirationDate();
        for (int i = 1; i < bouquet.length; i++) {
            if (bouquet[i].getExpirationDate().isAfter(bouquet[i - 1].getExpirationDate())) {
                lastDay = bouquet[i].getExpirationDate();
            }
        }
        System.out.println("Букет завянет: " + lastDay.toString());
        int bouquetPrice = 0;
        for (int i = 0; i < bouquet.length; i++) {
            bouquetPrice = bouquetPrice + bouquet[i].getPrice();
        }
        System.out.println("Цена букета " + bouquetPrice);

        String[] colors = new String[flowersCount];

        for (int i = 0; i < flowersCount; i++) {
            colors[i] = bouquet[i].getColor();
        }


        for (int i = 0; i < colors.length; i++) {

            for (int j = i + 1; j < colors.length; j++) {

                if (colors[i].equals(colors[j])) {
                    colors = remove(colors, j);
                    j--;

                }
            }

        }


        System.out.print("В букет входя цвета: ");
        for (int i = 0; i < colors.length; i++) {
            System.out.print(colors[i] + " ");
        }

    }


    private static String[] remove(String[] values, int index) {

        String[] result = new String[values.length - 1];

        for (int i = 0; i < values.length; i++) {
            if (i != index) {
                int newIndex = i < index ? i : i - 1;
                result[newIndex] = values[i];
            }
        }

        return result;
    }

}
