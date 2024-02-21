public class Main {
    public static void main(String[] args) {


        Food roastBeef = new Beef();
        Food cabbege1 = new Cabbege();
        Food roastedChiken1 = new Chiken();
        Food orange = new Orange();
        Food pistachio = new Pistachio();
        Food potatoFryed = new Potato();
        Food saltSalman = new Salmon();

        Food[] meal1 = {roastBeef, cabbege1, orange, pistachio};
        Food[] meal2 = {cabbege1, orange, pistachio};

        System.out.println(VegetarionCheck.isVegetarian(meal1));
        System.out.println(VegetarionCheck.isVegetarian(meal2));
    }
}