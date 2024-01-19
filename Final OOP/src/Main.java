public class Main {
    public static void main(String[] args) {
        House home = new House(40, 19.0F);
        home.printHouseStatus();

        Heater heater = new Heater();
        Humidifier humidifier = new Humidifier();

        heater.execute(5, home);
        humidifier.execute(20, home);

        home.printHouseStatus();
    }
}