package homework.statics;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Car {
    private String brand;
    private String colour;
    public static double cost = 200_000.0;
}
