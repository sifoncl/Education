import java.time.LocalDateTime;

public class Flower {

    private String name;
    private int price;
    private LocalDateTime receiptDate;
    private long daysToExpirationDate;
    private LocalDateTime expirationDate;
    private String color;

    public Flower(String name, int price, LocalDateTime receiptDate, int daysToExpirationDate, String color) {
        this.name = name;
        this.price = price;
        this.receiptDate = receiptDate;
        this.daysToExpirationDate = daysToExpirationDate;
        this.color = color;
        this.expirationDate = this.receiptDate.plusDays(daysToExpirationDate);
    }

    public Flower() {
    }

    public int getPrice() {
        return price;
    }

    private void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getReceiptDate() {
        return receiptDate;
    }

    private void setReceiptDate(LocalDateTime receiptDate) {
        this.receiptDate = receiptDate;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    private void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Цветок: " + name +
                " Цена: " + price +
                ", Дата поступления: " + receiptDate.toString() +
                ", Дата увядания: " + expirationDate.toString() +
                ", Цвет: " + color;
    }

}

