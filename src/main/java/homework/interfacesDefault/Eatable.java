package homework.interfacesDefault;

public interface Eatable {
    default void eat() {
        System.out.println("Кушаю");
    }
}
