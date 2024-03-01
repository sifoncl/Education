import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {


    private String Country;

    private String city;

    private String street;

    private Integer houseNumber;

}
