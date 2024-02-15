public class Worker  extends Thread{

    static Object key = new Object();
    static Object hammer = new Object();

    public void run(){
        try {
            keyThenHammer();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            hammerThenKey();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    private void keyThenHammer() throws InterruptedException {
        synchronized (key){
            System.out.println(this.getName()+" Взял ключ");
            sleep(1000);
            synchronized (hammer){
                System.out.println(this.getName() +" Взял молоток");
            }
        }
    }
    private void hammerThenKey() throws InterruptedException {
        synchronized (hammer){
            System.out.println(this.getName()+" Взял ключ");
            sleep(1000);
            synchronized (key){
                System.out.println(this.getName() +" Взял молоток");
            }
        }
    }

}




