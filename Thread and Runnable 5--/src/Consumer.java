public class Consumer extends Thread {

    Numbers nums;

    public Consumer(Numbers nums) {
        this.nums = nums;
    }

    public void run() {
        while (true) {
            nums.get();
        }
    }

}
