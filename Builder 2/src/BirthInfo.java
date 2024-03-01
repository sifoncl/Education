import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalTime;

@Value
@Builder
public class BirthInfo {

    LocalDate birthday;

    LocalTime birthtime;

    String birthplace;

    Double weight;

    Double height;

}
