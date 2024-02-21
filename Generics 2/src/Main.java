import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList();
        for (int i = 1; i < 10; i++) {
            arr.add(i);

        }
        ArrayHolder aH = new ArrayHolder();
        aH.setItem(arr);

        String[] arr1 = {"a", "b", "c", "d", "e", "f"};


        ArrayList<String> strArr = new ArrayList();
        for (int i = 0; i < arr1.length; i++) {
            strArr.add(arr1[i]);

        }

        ArrayHolder aH1 = new ArrayHolder();

        aH1.setItem(strArr);

        aH.prineElemet(2);

        aH1.prineElemet(2);

    }
}