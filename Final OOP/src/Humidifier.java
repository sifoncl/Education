public class Humidifier implements ClimateControl {
    @Override
    public void execute(int value, House house) {
        house.humidity = house.humidity + value;
    }
}
