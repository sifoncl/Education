public class Main {
    public static void main(String[] args) {
        Thread[] generators = {new Generator(), new Generator(), new Generator(), new Generator(), new Generator(),};
        for (Thread g : generators) {
            g.start();
        }
    }
}