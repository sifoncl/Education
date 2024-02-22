import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int ageMax = 30;
        int ageMin = 15;
        int maxNameLenghts = 2;
        int minNameLenghts = 10;

        ArrayList<String> firstFour = new ArrayList<>();


        List<Person> persons = Stream.generate(() -> Person.getRndPerson(ageMax, ageMin, maxNameLenghts, minNameLenghts))
                .limit(100)
                .filter(x -> x.getAge() < 21)
                .peek(x -> System.out.println(x))
                .sorted(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName))
                .limit(4)
                .peek(x -> firstFour.add(x.getSurname())).toList();


        System.out.println(persons);
        System.out.println(firstFour);

    }


}