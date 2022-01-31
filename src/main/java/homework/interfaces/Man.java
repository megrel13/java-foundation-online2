package homework.interfaces;

public class Man implements Walkable, Swimable, Runnable {
    @Override
    public void walk() {
        System.out.println("Я человек! я иду!");

    }

    @Override
    public void run() {
        System.out.println("Я человек! Я бегу!");

    }

    @Override
    public int maxRunDistance() {
        System.out.println("Максимальная дистанция для пробежки: ");
        return 10;
    }

    @Override
    public void swim() {
        System.out.println("Я человек! Я плыву!");

    }

    @Override
    public double maxSwimSpeed() {
        System.out.println("Максимальная скорость плавания: ");
        return 2;
    }
}
