import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneBookTest {

    @Test
    public void addUserTest() {
        PhoneBookImpl phoneBook = new PhoneBookImpl();
        try {
            phoneBook.addUser("Grisha", 245, LocalDate.now());
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    @Test
    public void getNumberByNameTest() throws PhoneBookExeptions {
        PhoneBookImpl phoneBook = new PhoneBookImpl();
        phoneBook.addUser("Grisha", 245, LocalDate.now());
        assertTrue(phoneBook.getNumberByName("Grisha") == 245);
    }


    @Test
    public void getNameByNumberTest() throws PhoneBookExeptions {
        PhoneBookImpl phoneBook = new PhoneBookImpl();
        phoneBook.addUser("Grisha", 245, LocalDate.now());
        assertTrue(phoneBook.getNameByNumber(245).equals("Grisha"));

    }

    @Test
    void storeToFileTest() {
        PhoneBookImpl phoneBook = new PhoneBookImpl();
        phoneBook.addUser("Grisha", 245, LocalDate.now());
        phoneBook.storeToFile(new File("G:/PhonebookTest.dat"));
    }

    @Test
    public void loadFromFile() throws PhoneBookExeptions {
        PhoneBookImpl phoneBook = new PhoneBookImpl();
        phoneBook.addUser("Grisha", 245, LocalDate.now());
        phoneBook.storeToFile(new File("G:/PhonebookTest2.dat"));
        PhoneBookImpl phoneBook2 = new PhoneBookImpl();
        phoneBook2.loadFromFile(new File("G:/PhonebookTest2.dat"));

        assertTrue(phoneBook.getNameByNumber(245).equals(phoneBook2.getNameByNumber(245)));
        assertTrue(phoneBook.getNumberByName("Grisha") == (phoneBook2.getNumberByName("Grisha")));
    }

}