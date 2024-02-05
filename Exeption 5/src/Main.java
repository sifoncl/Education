import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean gameOn = true;
        while (gameOn == true) {
            Random rnd = new Random();
            int guessedNumber = rnd.nextInt(1, 100);

            int attempts = 4;

            System.out.println("Я загодал число от 1 до 100, угадай число, у тебя " + attempts + " попытки.");
            boolean lose = false;
            while (!lose) {

                try {
                    Scanner scn = new Scanner(System.in);
                    int attemptNum = scn.nextInt();
                    if (attemptNum == 1996) {
                        System.out.println("Ты ввел чит, число которое я загодал: " + guessedNumber);
                        continue;
                    } else if (attemptNum > 100) {
                        System.out.println("Ты ввел число больше 100, попробуй еще раз");
                        continue;
                    } else if (attemptNum < 1) {
                        System.out.println("Ты ввел число меньше 1, попробуй еще раз");
                        continue;
                    } else if (attemptNum == guessedNumber) {
                        System.out.println("ТЫ ВЫИГРАЛ!!!");
                        lose = true;
                        continue;
                    } else if (attemptNum > guessedNumber) {
                        attempts--;
                        if (attempts == 0) {
                            System.out.println("У тебя закончиличь попытки(");
                            lose = true;
                            continue;
                        } else {
                            System.out.println("Не угадал число котрое я загодал меньше. У тебя осталось " + attempts + " попыток");
                        }
                    } else if (attemptNum < guessedNumber) {
                        attempts--;
                        if (attempts == 0) {
                            System.out.println("У тебя закончиличь попытки(");
                            lose = true;
                            continue;
                        } else {
                            System.out.println("Не угадал число котрое я загодал больше. У тебя осталось " + attempts + " попыток");
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Введено не число, попробуй еще раз. Необходими число от 1 до 100 без лишних знаков и пробелов.");
                }
            }
            System.out.println("Хочешь сиграть еще?(Y/N)");
            boolean getAnsver = false;
            while (!getAnsver) {
                Scanner scn = new Scanner(System.in);
                String ansver = scn.nextLine();
                switch (ansver) {
                    case "N":
                        gameOn = false;
                        getAnsver = true;
                        System.out.println("До свидания!");
                        break;
                    case "Y":
                        getAnsver = true;
                        break;
                    default:
                        System.out.println("Ответ не понятен. Хочешь сиграть еще?(Y/N)");
                        break;
                }
            }
        }
    }
}
