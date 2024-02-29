import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        PersonBuilder pB = new PersonBuilder();
        System.out.println("Введите имя");
        pB.setName(scn.nextLine());
        System.out.println("Введите Фамилию");
        pB.setLastName(scn.nextLine());
        System.out.println("Введите адрес");
        pB.setAddress(scn.nextLine());
        System.out.println("Введите год рождения");
        pB.setYear(scn.nextInt());


        Person p = pB.buildPerson();


        System.out.println(p);
    }
}