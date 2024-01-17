public enum FoodType {
    PORRIDGE(true), BREAD(true), VEGETABLE(true), NUT(true),
    FRUIT(true),
    DAIRY(true), FISH(false), GREENS(true), MEAT(false),
    UNKNOWN(false);

    private boolean vegeterian;


    FoodType(boolean vegeterian) {
        this.vegeterian = vegeterian;
    }

    public boolean isVegeterian() {
        return this.vegeterian;
    }


}

