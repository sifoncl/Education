import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> grade = new LinkedList();
        Random rnd = new Random();
        Integer rndGrade = rnd.nextInt(1, 5);

        for (int i = 0; i < 20; i++) {
            grade.add(rndGrade = rnd.nextInt(1, 6));

        }
        System.out.println(grade);

        Iterator<Integer> iterator = grade.iterator();
        int largestGrade = 0;
        int gradeTemp;
        while (iterator.hasNext()) {
            gradeTemp = (Integer) iterator.next();
            if (gradeTemp <= 3) {
                iterator.remove();

            }
            if (gradeTemp > largestGrade) {
                largestGrade = gradeTemp;
            }
        }
        System.out.println(grade);
        System.out.println(largestGrade);
    }
}