package proj.entities;

import lombok.Data;

@Data
public class Location {
        Long id;
        Float latitude;
        Float longitude;
        Integer radius;
}

