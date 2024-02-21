public class Beef extends Food {

    String name = "говядина";

    FoodType type = FoodType.MEAT;

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
