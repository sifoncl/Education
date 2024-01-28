import java.util.Comparator;
import java.util.Map;

public class NamePriceComparator implements Comparator<Map.Entry<Product, Integer>> {
    @Override
    public int compare(Map.Entry<Product, Integer> o1, Map.Entry<Product, Integer> o2) {
        return o1.getKey().getName().compareTo(o2.getKey().getName());
    }


}