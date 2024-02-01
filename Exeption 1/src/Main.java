public class Main {
    public static void main(String[] args) {
        Integer n = null;
        try {
            System.out.println(n.toString());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException (оно же NPE) это исключение, которое выбрасывается каждый раз," +
                    " когда вы обращаетесь к методу или полю объекта по ссылке, которая равна null.");
        }

    }
}