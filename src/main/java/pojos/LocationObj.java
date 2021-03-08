package pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationObj {
    Float latitude;
    Float longitude;
    Integer radius;
}
