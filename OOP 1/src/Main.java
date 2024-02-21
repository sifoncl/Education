public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker();
        Foreman foreman1 = new Foreman();
        Director director1 = new Director();

        System.out.println(worker1.getSalary());
        System.out.println(foreman1.getSalary());
        System.out.println(director1.getSalary());
    }
}