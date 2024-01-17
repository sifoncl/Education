public class Pistachio extends Food {

    String name = "фисташки";

    FoodType type = FoodType.NUT;

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
