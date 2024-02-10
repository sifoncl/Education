import java.io.Serializable;
import java.time.LocalDate;

public class User implements Serializable {

    String name;
    int number;
    LocalDate createdDate;

    @Override
    public String toString() {
        return name + ", " + number +
                ", " + createdDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public User(String name, int number, LocalDate createdDate) {
        this.name = name;
        this.number = number;
        this.createdDate = createdDate;
    }
}
