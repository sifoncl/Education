import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {


        Person p = Person.builder()
                .name("Petya")
                .lastName("Pertrov")
                .birthInfo(BirthInfo.builder().birthday(LocalDate.now()).birthtime(LocalTime.now())
                        .birthplace("Rostov-on-Don").height(56.2).weight(3600.2).build())
                .addres(Address.builder().city("Rostov-on-Don").Country("Russia").street("Petrenko").houseNumber(22).build())
                .build();

        System.out.println(p);
           }
}