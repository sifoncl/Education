import java.util.*;

public class Manager {

    public static void addToCart(Cart cart, Product p, int count) {

        if (cart.getCart().containsKey(p)) {
            int inAll = cart.getCart().get(p) + count;
            cart.getCart().put(p, inAll);
        } else {
            cart.getCart().put(p, count);
        }
    }


    public static int countSum(Cart cart) {
        int sum = 0;
        for (Map.Entry<Product, Integer> entry : cart.getCart().entrySet()) {

            sum = sum + (entry.getKey().getPrice() * entry.getValue());

        }
        return sum;
    }

    public static void printCart(Cart cart) {
        for (Map.Entry<Product, Integer> entry : cart.getCart().entrySet()) {
            System.out.println("Наименование товара: " + entry.getKey() + ", Количество: " + entry.getValue());

        }
        System.out.println("Сумма по чеку: " + countSum(cart));
    }

    public static void printCart(Cart cart, String sortType) {


        List<Map.Entry<Product, Integer>> sortedCart = new LinkedList<>(cart.getCart().entrySet());

        switch (sortType) {
            case "по имени":
                sortedCart.sort(new NameComparator());
                break;
            case "по цене":
                sortedCart.sort(new PriceComparator());
                break;
            case "по имени и цене":
                sortedCart.sort(new NameComparator().thenComparing(new PriceComparator()));

        }

        for (Map.Entry<Product, Integer> entry : sortedCart) {
            System.out.println("Наименование товара: " + entry.getKey().getName() + ", Количество: " + entry.getValue());

        }
        System.out.println("Сумма по чеку: " + countSum(cart));


    }
}