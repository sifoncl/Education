public class Humidifier extends ClimateController {


    public void execute(int value, House house) {

        house.setHumidity(house.getHumidity() + value);
    }
}
