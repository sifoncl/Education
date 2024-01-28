import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> nonSortedMap = Map.of("two", 2, "five", 5,
                                                    "three", 3, "one", 1, "four", 4);
        Map<String, Integer> sortedMap = sortByValue(nonSortedMap);
        System.out.println(sortedMap);
    }

    static Map<String, Integer> sortByValue(Map<String, Integer> notSorted) {
        Comparator comparator = new ValueComparator();
        List<Map.Entry<String, Integer>> temp = new LinkedList<>(notSorted.entrySet());

        temp.sort(new ValueComparator());

        LinkedHashMap<String, Integer> sorted = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entery : temp) {
            sorted.put(entery.getKey(), entery.getValue());
        }
        return sorted;
    }
}