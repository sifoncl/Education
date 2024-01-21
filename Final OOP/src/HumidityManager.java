
public class HumidityManager extends ClimateManager {
    @Override
    public ClimateControl createClimateController() {
        return new Humidifier();
    }
}