public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        catLife();
    }

    public static Cat catCreator() throws InstantiationException, IllegalAccessException {
        return Cat.class.newInstance();

    }

    public static void catLife() throws InstantiationException, IllegalAccessException {
        Cat cat = catCreator();
        cat.eat();
        cat.sleep(21);
    }

}