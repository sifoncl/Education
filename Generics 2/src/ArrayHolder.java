import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayHolder<A extends ArrayList> {

    A anyArray;


    public A getItem() {
        return anyArray;
    }

    public void setItem(A item) {
        this.anyArray = item;
    }


    public void prineElemet(int index) {

        System.out.println(this.anyArray.get(index).toString());

    }


}
