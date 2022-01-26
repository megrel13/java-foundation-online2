package homework.interfaces;

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Я птица! Я летаю!");

    }

    @Override
    public int flyMaxDistance() {
        System.out.println("Максимальная дистанция для полетов");
        return 40;
    }
}
