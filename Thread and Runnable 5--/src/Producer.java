public class Producer extends Thread {
    private Numbers nums;

    public Producer(Numbers nums) {
        this.nums = nums;
    }

    public void run() {
        while (true) {
            nums.add();
        }
    }
}
