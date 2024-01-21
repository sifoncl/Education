public class Heater implements ClimateController {
    @Override
    public void execute(int value, House house) {
        house.setTemperature(house.getTemperature() + value);
    }
}
