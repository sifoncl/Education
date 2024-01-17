public class Cabbege extends Food {

    String name = "капуста";

    FoodType type = FoodType.VEGETABLE;

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




