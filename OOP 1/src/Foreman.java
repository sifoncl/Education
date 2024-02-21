public class Foreman extends Worker {

    final static int FOREMAN_PREMIUM =5000;
    @Override
    public int getSalary() {
        return super.getSalary()+FOREMAN_PREMIUM;
    }
}
