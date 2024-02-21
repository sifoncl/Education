public class VegetarionCheck {


    public static boolean isVegetarian(Food[] foods) {

        for (Food food : foods) {
            FoodType foodType = food.getFoodType();


            if (foodType.isVegeterian() == false) {
                return false;
            }

        }
        return true;

    }

}
