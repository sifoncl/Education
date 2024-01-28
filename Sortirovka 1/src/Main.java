import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> myStudents = new LinkedList<>();

        myStudents.add(new Student("Misha", "2b", 1.2));
        myStudents.add(new Student("Petya", "1b", 4.1));
        myStudents.add(new Student("Vasya", "2a", 3.1));
        myStudents.add(new Student("Grisha", "3b", 2.5));
        myStudents.add(new Student("Sasha", "1b", 5.0));
        myStudents.add(new Student("Misha", "4b", 3.0));
        myStudents.add(new Student("Misha", "1b", 3.2));
        myStudents.add(new Student("Misha", "2b", 4.3));
        myStudents.add(new Student("Misha", "3b", 2.1));
        myStudents.add(new Student("Dasha", "1b", 5.0));

        System.out.println(myStudents);

        Iterator<Student> deleteStupid = myStudents.iterator();
        while (deleteStupid.hasNext()) {

            if (deleteStupid.next().getAverageGrade() < 3) {
                deleteStupid.remove();
            }
        }
        System.out.println(myStudents);


        NameComparator stdNameComparator = new NameComparator();
        LinkedList<Student> soretedByName = new LinkedList<>(myStudents);
        soretedByName.sort(stdNameComparator);


        System.out.println(soretedByName);

        GroupeComparator stdGroupeComparator = new GroupeComparator();

        LinkedList<Student> sortedByGroupe = new LinkedList<>(myStudents);
        sortedByGroupe.sort(stdGroupeComparator);

        System.out.println(sortedByGroupe);


        AverageGradeComparator stdAverageGradeComparator = new AverageGradeComparator();

        LinkedList<Student> sortedByAverageGrade = new LinkedList<>(myStudents);

        sortedByAverageGrade.sort(stdAverageGradeComparator);
        System.out.println(sortedByAverageGrade);

        LinkedList<Student> sortedByGroupeThenGrade = new LinkedList<>();

        Comparator<Student> stdByGroupeThenGrade = new GroupeComparator().thenComparing(stdAverageGradeComparator);

        sortedByGroupeThenGrade.sort(stdByGroupeThenGrade);
        System.out.println(sortedByAverageGrade);
    }

}
