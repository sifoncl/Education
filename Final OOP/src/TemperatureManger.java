public class TemperatureManger extends ClimateManager {


    @Override
    public ClimateController createClimateController() {
        return new Heater();
    }
}


