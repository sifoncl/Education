import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {

        File myPersonsFile = new File("G:/", "myPersonsFile.txt");
        myPersonsFile.createNewFile();
        FileWriter myPersonsFileWriter = new FileWriter(myPersonsFile);

        File myPersosnsFileSerialized = new File("G:/", "myPersosnsFileSerialized.dat");


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(myPersosnsFileSerialized))) {
            Person[] myPersons = new Person[10];
            Random rnd = new Random();
            for (Person p : myPersons) {
                p = new Person(getRndName(2, 7), getRndName(2, 7), rnd.nextInt(1, 100));
                myPersonsFileWriter.write(p.toString() + "\n");
                oos.writeObject(p);
            }
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(myPersosnsFileSerialized))) {
            Person[] deserializedPersons = new Person[10];
            for (Person p : deserializedPersons) {
                p = (Person) ois.readObject();
                System.out.println(p);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getRndName(int minLength, int maxLength) {
        Random rnd = new Random();
        char[] array = new char[rnd.nextInt(minLength, maxLength)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) rnd.nextInt(1072, 1103);
        }
        array[0] = Character.toUpperCase(array[0]);
        return String.valueOf(array);
    }
}