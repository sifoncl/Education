import java.time.LocalDateTime;

public class Orchid extends Flower {
    public Orchid(LocalDateTime receiptDate, String color) {
        super("Орхидея", 100, receiptDate, 4, color);
    }
}
