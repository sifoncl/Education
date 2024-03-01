import java.util.Arrays;
import java.util.LinkedList;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

        Class clazz = LinkedList.class;
        Class clazz2 = HashMap.class;

        classInfoPrinter(clazz);
        classInfoPrinter(clazz2);
    }

    public static void classInfoPrinter(Class clazz){
        System.out.println(Arrays.toString(clazz.getFields()));
        System.out.println(clazz.getSuperclass().toString());
        System.out.println(Arrays.toString(clazz.getDeclaredMethods()));
        System.out.println(Arrays.toString(clazz.getConstructors()));
        System.out.println(Arrays.toString(clazz.getPermittedSubclasses()));



    }



}