import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("Морковка", 20);
        Product p2 = new Product("Картошка", 10);
        Product p3 = new Product("Помидор", 30);
        Product p4 = new Product("Кабачок", 50);
        Product p5 = new Product("Тыква", 40);
        Product p6 = new Product("Лук", 25);
        Product p7 = new Product("Огурец", 50);
        Product p8 = new Product("Перец", 30);
        Product p9 = new Product("Перец", 70);

        Cart myCart = new Cart();
        System.out.println(myCart.getCart());

        Manager.addToCart(myCart, p1, 1);
        Manager.addToCart(myCart, p2, 7);
        Manager.addToCart(myCart, p4, 4);
        Manager.addToCart(myCart, p1, 1);
        Manager.addToCart(myCart, p3, 5);
        Manager.addToCart(myCart, p6, 6);
        Manager.addToCart(myCart, p7, 2);
        Manager.addToCart(myCart, p8, 1);
        Manager.addToCart(myCart, p9, 1);
        Manager.addToCart(myCart, p5, 1);

        Manager.printCart(myCart);

        Manager.printCart(myCart, new SortOptions(SortOptions.SortField.BY_NAME, SortOptions.SortOrder.ASC));
        Manager.printCart(myCart, new SortOptions(SortOptions.SortField.BY_PRICE, SortOptions.SortOrder.ASC));
        Manager.printCart(myCart, new SortOptions(SortOptions.SortField.BY_NAME_AND_PRICE, SortOptions.SortOrder.ASC));
        Manager.printCart(myCart, new SortOptions(SortOptions.SortField.BY_NAME, SortOptions.SortOrder.DESC));
        Manager.printCart(myCart, new SortOptions(SortOptions.SortField.BY_PRICE, SortOptions.SortOrder.DESC));
        Manager.printCart(myCart, new SortOptions(SortOptions.SortField.BY_NAME_AND_PRICE, SortOptions.SortOrder.DESC));
    }
}