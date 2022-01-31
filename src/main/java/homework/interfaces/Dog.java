package homework.interfaces;

public class Dog implements Walkable, Swimable, Runnable {
    @Override
    public void walk() {
        System.out.println("Я собака! я иду!");

    }

    @Override
    public void run() {
        System.out.println("Я собака! Я бегу!");

    }

    @Override
    public int maxRunDistance() {
        System.out.println("Максимальная дистанция для пробежки: ");
        return 20;
    }

    @Override
    public void swim() {
        System.out.println("Я собака! Я плыву!");

    }

    @Override
    public double maxSwimSpeed() {
        System.out.println("Максимальная скорость плавания: ");
        return 3;
    }
}
