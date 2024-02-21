import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(Season.SPRING.name());
        System.out.println(Season.SPRING.getDescriotion());
        System.out.println(Season.SPRING.getCountOfDays());
        System.out.println(Season.SUMMER.name());
        System.out.println(Season.SUMMER.getDescriotion());
        System.out.println(Season.SUMMER.getCountOfDays());
        System.out.println(Season.AUTUMN.name());
        System.out.println(Season.AUTUMN.getDescriotion());
        System.out.println(Season.AUTUMN.getCountOfDays());
        System.out.println(Season.WINTER.name());
        System.out.println(Season.WINTER.getDescriotion());
        System.out.println(Season.WINTER.getCountOfDays());

        System.out.println(Season.nextSeason(Season.WINTER));

    }
}




