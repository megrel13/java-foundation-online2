package homework.Junit;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.ls.LSOutput;

@Getter
@Setter
@Data
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void birthday() {
        age++;
    }

    public boolean takeBeer() {
        if (age >= 18) {
            return true;
        }
        return false;
    }
}

