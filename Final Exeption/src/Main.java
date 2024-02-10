import java.io.File;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws PhoneBookExeptions {
        PhoneBookImpl phoneBook = new PhoneBookImpl();
        phoneBook.addUser("Ivan", 123, LocalDate.now());
        phoneBook.addUser("Petr", 345, LocalDate.now());

        phoneBook.storeToFile(new File("G:/phonebook.dat"));

        PhoneBookImpl phoneBook2 = new PhoneBookImpl();
        phoneBook2.loadFromFile(new File("G:/phonebook.dat"));

        phoneBook.storeToTextFile(new File("G:/phonebook.txt"));


        PhoneBookImpl phoneBook3 = new PhoneBookImpl();
        phoneBook3.loadFromTextFile(new File("G:/phonebook.txt"));


        System.out.println(phoneBook.getNameByNumber(123));
        System.out.println(phoneBook.getNumberByName("Petr"));

        PhoneBookImpl.printPhoneBook(phoneBook);
        System.out.println("\n");
        PhoneBookImpl.printPhoneBook(phoneBook2);
        System.out.println("\n");
        PhoneBookImpl.printPhoneBook(phoneBook3);
    }
}