package francescocristiano.U5_W1_D1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Drink {
    private String name;
    private double price;
    private int calories;
    private double size;
    private Double alcoholConcentration;

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
