public class PersonBuilder implements Builder {


    private String name;
    private String lastName;
    private int year;
    private String addres;


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void setAddress(String address) {
        this.addres = address;
    }

    public Person buildPerson() {
        return new Person(name, lastName, year, addres);
    }
}
