public abstract class ClimateManager {
    void execute(int value, House house) {
        ClimateController climateController = createClimateController();
        climateController.execute(value, house);
    }

    public abstract ClimateController createClimateController();
}
