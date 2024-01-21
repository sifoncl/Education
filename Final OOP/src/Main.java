import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        House home = new House(20.0, 45);
        home.printStatus();

        String type = sc.next();

        HouseManager.configManager(type);


        HouseManager.climatecomntroller.execute(20, home);
        home.printStatus();
        type = sc.next();

        HouseManager.configManager(type);

        HouseManager.climatecomntroller.execute(15, home);
        home.printStatus();

    }
}