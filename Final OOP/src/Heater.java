public class Heater extends ClimateController {
    @Override
    void execute(int value, House house) {
        house.setTemperature(house.getTemperature() + value);
    }
}
