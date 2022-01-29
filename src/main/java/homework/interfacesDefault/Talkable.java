package homework.interfacesDefault;

public interface Talkable {
     default void talk(){
         System.out.println("Разговариваю");
     }
}
