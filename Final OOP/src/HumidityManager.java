
public class HumidityManager extends ClimateManager {
    @Override
    public ClimateController createClimateController() {
        return new Humidifier();
    }
}