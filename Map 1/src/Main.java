import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        Toy toy = new Toy("Tiger", 0, 1000);

        Toy toy1 = new Toy("Dinosaurs", 4, 2000);

        Toy toy2 = new Toy("Car", 7, 3000);

        Toy toy3 = new Toy("Cat", 3, 2000);

        Toy toy4 = new Toy("Shark", 5, 600);

        Toy toy5 = new Toy("Penguin", 2, 4000);

        HashMap<String, Toy> myToys = new HashMap<>();

        myToys.put(toy.getName(), toy);
        myToys.put(toy1.getName(), toy1);
        myToys.put(toy2.getName(), toy2);
        myToys.put(toy3.getName(), toy3);
        myToys.put(toy4.getName(), toy4);
        myToys.put(toy5.getName(), toy5);


        System.out.println(myToys.entrySet());
        System.out.println(myToys.keySet());
        System.out.println(myToys.values());


    }
}