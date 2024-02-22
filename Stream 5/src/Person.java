import java.util.Random;

public class Person {

    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    static Person getRndPerson(int ageMax, int ageMin, int maxNameLenghts, int minNameLenghts) {
        return new Person(getRndString(maxNameLenghts, minNameLenghts), getRndString(maxNameLenghts, minNameLenghts),
                new Random().nextInt(ageMin, ageMax));
    }

    public static String getRndString(int minLength, int maxLength) {
        Random rnd = new Random();
        char[] array = new char[rnd.nextInt(minLength, maxLength)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) rnd.nextInt(1072, 1103);
        }
        array[0] = Character.toUpperCase(array[0]);
        return String.valueOf(array);
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }


}


