public class Student {

    private String name, group;
    double averageGrade;

    public Student(String name, String group, double averageGrade) {
        this.name = name;
        this.group = group;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Имя: '" + name + '\'' +
                ", група: " + group + '\'' +
                ", Средний бал" + averageGrade;
    }
}
