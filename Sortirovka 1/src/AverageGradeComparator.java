import java.util.Comparator;

public class AverageGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.averageGrade < o2.averageGrade) {
            return -1;
        }
        if (o1.averageGrade > o2.averageGrade) {
            return 1;
        }
        return 0;
    }
}