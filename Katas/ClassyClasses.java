package Katas;

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String info() {
        return this.name + "age is" + this.age;
    }
}
