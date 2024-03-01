import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class someClass = Man.class;

        Man man = new Man("Sasha", 26, false);
        System.out.println(Arrays.toString(someClass.getDeclaredFields()) + "\n" + Arrays.toString(someClass.getMethods()));

        Method met = someClass.getDeclaredMethod("setAlive", boolean.class);

        System.out.println(man);

        met.invoke(man, true);   //Оживляем Сашу рефлексией)

        System.out.println(man);
    }
}