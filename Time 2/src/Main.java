import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int dayNum = scn.nextInt();

        LocalDateTime now = LocalDateTime.now();

        LocalDateTime someDaysBefore = now.minusDays(dayNum);

        ZoneId yerevan = ZoneId.of("Asia/Yerevan");
        someDaysBefore.atZone(yerevan);

        System.out.println(someDaysBefore.format(DateTimeFormatter.ofPattern("d MMMM yyyy HH:mm")));

    }
}