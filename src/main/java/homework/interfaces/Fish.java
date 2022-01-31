package homework.interfaces;

public class Fish implements Swimable {


    @Override
    public void swim() {
        System.out.println("Я рыба! Я плыву!");

    }

    @Override
    public double maxSwimSpeed() {
        System.out.println("Максимальная дистанция плавания");
        return 100;
    }
}
