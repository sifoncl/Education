import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название машины");
        String s = scanner.nextLine();
        System.out.println(s);
        Car car1 = new Car(s);
        System.out.println("Введите название мотоцикла");
        s = scanner.nextLine();
        Motorcycle motorcycle1 = new Motorcycle(s);

        Garage garage1 = new Garage();
        Garage garage2 = new Garage();
        garage1.setItem(car1);
        garage2.setItem(motorcycle1);
        System.out.println(garage1.toString() + "\n" + garage2.toString());
    }
}