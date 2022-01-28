package homework.interfacesDefault;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Plant implements Eatable,Talkable{
    @Override
    public void eat() {
        System.out.println("Я поглощаю солнечный свет и впитываю минералы с земли");
    }

    @Override
    public void talk() {
        System.out.println("Я ни с кем не разговариваю");
    }
}
