package pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

@Data
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SuspectObj {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Set<String> involvedIn;
}
