import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> integerList = new LinkedList<Integer>();


        Thread[] generators = {new Generator(integerList), new Generator(integerList),
                new Generator(integerList), new Generator(integerList), new Generator(integerList),};
        for (Thread g : generators) {
            g.start();
        }
        while (true) {
            if ((!generators[0].isAlive()) && (!generators[1].isAlive()) && (!generators[2].isAlive()) && (!generators[3].isAlive()) && (!generators[4].isAlive())) {
                System.out.println(integerList.size());
                break;
            }
        }
    }
}