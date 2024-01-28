import java.util.HashMap;

public class Cart {

    private HashMap<Product, Integer> cart;

    public Cart() {
        this.cart = new HashMap<Product, Integer>();
    }

    public HashMap<Product, Integer> getCart() {
        return cart;
    }

    public void setCart(HashMap<Product, Integer> cart) {
        this.cart = cart;
    }

}
