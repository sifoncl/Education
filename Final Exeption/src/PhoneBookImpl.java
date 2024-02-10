import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class PhoneBookImpl implements PhoneBook, Serializable {


    private ArrayList<User> Users = new ArrayList<User>();

    @Override
    public void addUser(String name, int number, LocalDate createdDate) {
        Users.add(new User(name, number, createdDate));
    }

    public static void printPhoneBook(PhoneBookImpl phoneBook) {
        for (User u : phoneBook.Users) {
            System.out.println(u);

        }
    }


    @Override
    public int getNumberByName(String name) throws PhoneBookExeptions {
        for (User u : Users) {
            if (u.getName().equals(name))
                return u.getNumber();
        }
        throw new PhoneBookExeptions("Имя не найдено");
    }

    @Override
    public String getNameByNumber(int number) throws PhoneBookExeptions {
        for (User u : Users) {
            if (u.getNumber() == number) {
                return u.getName();
            }
        }
        throw new PhoneBookExeptions("Номер не найден");
    }

    @Override
    public void storeToFile(File phoneBookFile) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(phoneBookFile))) {
            for (User u : Users) {
                oos.writeObject(u);
            }
        } catch (IOException e) {
        }
    }

    @Override
    public void loadFromFile(File phoneBookFile) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(phoneBookFile))) {
            while (true) {
                try {
                    Users.add((User) ois.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Файл Содержит не те классы");
            throw new RuntimeException(e);
        }

    }

    @Override
    public void storeToTextFile(File phoneBookFile) {
        try (FileWriter phoneBookFileWriter = new FileWriter(phoneBookFile);
             BufferedWriter bufPhoneBookFileWriter = new BufferedWriter(phoneBookFileWriter)) {
            for (User u : Users) {
                bufPhoneBookFileWriter.write(u.toString() + "\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Не удалось произвети запись в файл: " + phoneBookFile.getAbsolutePath() + " Возможно файл только для чтения.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void loadFromTextFile(File phoneBookFile) throws PhoneBookExeptions {
        try (FileReader phoneBookFileReader = new FileReader(phoneBookFile);
             BufferedReader bufPhoneBookFileReader = new BufferedReader(phoneBookFileReader)) {
            String userStr = bufPhoneBookFileReader.readLine();
            while (userStr != null) {
                userStr = userStr.replaceAll(" ", "");

                if (userStr.matches("\\b.+\\b,+[0-9]+,[0-9]{4}-[0-9]{2}-[0-9]{2}")) {
                    System.out.println(userStr);
                    System.out.println(userStr);
                    String[] userParams = userStr.split(",");
                    String[] dateParams = userParams[2].split("-");
                    LocalDate userDate = LocalDate.of(Integer.parseInt(dateParams[0]), Integer.parseInt(dateParams[1]), Integer.parseInt(dateParams[2]));
                    Users.add(new User(userParams[0], Integer.parseInt(userParams[1]), userDate));
                } else {
                    throw new PhoneBookExeptions("Строка не соответсвует формату: \"Ivan, 123, 2024-02-10\"");
                }
                userStr = bufPhoneBookFileReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



