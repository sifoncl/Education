public class MyArethmeticExeptions extends Exception{

    private String msg;

    public MyArethmeticExeptions(String msg) {
        super(msg);
        this.msg = msg;
    }
}