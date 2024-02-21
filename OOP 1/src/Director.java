public class Director extends Foreman {
 final static int DIRECTOR_PREMIUM = 100000;
     @Override
    public int getSalary() {
        return super.getSalary()+DIRECTOR_PREMIUM;
    }
}


