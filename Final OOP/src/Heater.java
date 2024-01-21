public class Heater implements ClimateControl {
    @Override
    public void execute(int value, House house) {
        house.temperature = house.temperature + value;
    }
}
