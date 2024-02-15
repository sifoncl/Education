public class Main {
    public static void main(String[] args) {

        Numbers nums = new Numbers();

        Thread p1 = new Producer(nums);
        Thread p2 = new Producer(nums);
        Thread p3 = new Producer(nums);
        p1.start();
       p2.start();
        p3.start();

       Thread c1 =new Consumer(nums);
        Thread c2 =new Consumer(nums);
       c1.start();
        c2.start();

    }
}