public class Orange extends Food {

    String name = "апельсин";

    FoodType type = FoodType.FRUIT;

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
