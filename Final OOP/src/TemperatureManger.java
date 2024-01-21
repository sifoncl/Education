public class TemperatureManger extends ClimateManager {


    @Override
    public ClimateControl createClimateController() {
        return new Heater();
    }
}


