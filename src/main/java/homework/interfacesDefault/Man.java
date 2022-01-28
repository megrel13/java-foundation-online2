package homework.interfacesDefault;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Man implements Talkable, Eatable {
    @Override
    public void eat() {
        System.out.println("Я ем корову и растения");
    }

    @Override
    public void talk() {
        System.out.println("Я разговариваю с коровами и растениями");
    }
}
