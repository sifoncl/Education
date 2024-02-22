import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int ageMax = 30;
        int ageMin = 15;
        int maxNameLenghts = 2;
        int minNameLenghts = 10;

        ArrayList firstFour = null;

        Stream.generate(() -> Person.getRndPerson(ageMax,ageMin,maxNameLenghts,minNameLenghts))
                .filter(x->x.getAge()<21)
                .peek(x->System.out.println(x))
                .sorted(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName))
                        .peek(x->firstFour.add(x))


        System.out.println("Hello world!");



    }


}