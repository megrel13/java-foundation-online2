package homework.interfacesDefault;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Cow implements Eatable, Talkable {
    @Override
    public void eat() {
        System.out.println("Я ем траву!");

    }

    @Override
    public void talk() {
        System.out.println("Я разговариваю с другими коровами");

    }
}
