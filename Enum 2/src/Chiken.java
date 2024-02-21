public class Chiken extends Food {

    String name = "курица";

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
