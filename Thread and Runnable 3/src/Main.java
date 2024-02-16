import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> integerList = new LinkedList<Integer>();


        Thread[] generators = {new Generator(integerList), new Generator(integerList),
                new Generator(integerList), new Generator(integerList), new Generator(integerList),};
        for (Thread g : generators) {
            g.start();
        }
    }
}