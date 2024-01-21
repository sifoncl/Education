public class HouseManager {

    public static ClimateControl climatecomntroller;

    public static void configManager(String type) {

        switch (type) {
            case "heater":
                climatecomntroller = new Heater();
                System.out.println("режим нагрева");
                break;
            case "humidifier":
                climatecomntroller = new Humidifier();
                System.out.println("режим увлажнения");
                break;
            default:
                System.out.println("нет такого типа устройства");
        }
    }
}
