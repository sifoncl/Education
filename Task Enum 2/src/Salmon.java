public class Salmon extends Food {

    String name = "ласось";

    FoodType type = FoodType.FISH;

    @Override
    public FoodType getFoodType() {
        return this.type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
