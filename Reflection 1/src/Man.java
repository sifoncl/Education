public class Man {

    String Name;
    int age;

    boolean alive;

    @Override
    public String toString() {
        return "Man{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }

    public Man(String name, int age, boolean alive) {
        Name = name;
        this.age = age;
        this.alive = alive;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
