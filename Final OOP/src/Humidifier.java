public class Humidifier implements ClimateController {
    @Override
    public void execute(int value, House house) {
        house.humidity = house.humidity + value;
    }
}
