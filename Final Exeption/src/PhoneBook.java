import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;

public interface PhoneBook {
    void addUser(String name, int number, LocalDate createdDate);

    int getNumberByName(String name) throws PhoneBookExeptions;

    String getNameByNumber(int number) throws PhoneBookExeptions;

    void storeToFile(File phoneBookFile);

    void loadFromFile(File phoneBookFile);

    void storeToTextFile(File phoneBookFile) throws FileNotFoundException;

    void loadFromTextFile(File phoneBookFile) throws PhoneBookExeptions;
}