import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int months = scn.nextInt();

        LocalDate date = LocalDate.of(2024, months, 1);

        while (months == date.getMonthValue()) {
            System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
            date = date.plusDays(1);
        }

    }
}