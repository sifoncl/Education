import java.util.Comparator;
import java.util.Map;

public class PriceComparator implements Comparator<Map.Entry<Product, Integer>> {
    @Override
    public int compare(Map.Entry<Product, Integer> o1, Map.Entry<Product, Integer> o2) {
        return o1.getKey().getPrice() - o2.getKey().getPrice();
    }


}