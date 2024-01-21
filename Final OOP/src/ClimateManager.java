public abstract class ClimateManager {
    void execute(int value, House house) {
        ClimateControl climateController = createClimateController();
        climateController.execute(value, house);
    }

    public abstract ClimateControl createClimateController();
}
