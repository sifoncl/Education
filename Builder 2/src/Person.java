import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class Person {

    private String name;
    private String lastName;
    private BirthInfo birthInfo;
    private Address addres;

}
