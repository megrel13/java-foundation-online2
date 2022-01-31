package homework.interfaces;

public class CreaturesActivity {
    public static void main(String[] args) {
        Runnable man = new Man();
        System.out.println("man.maxRunDistance() = " + man.maxRunDistance());
        man.run();

        Walkable man1 = new Man();
        man1.walk();

        Swimable man3 = new Man();
        System.out.println("man3.maxSwimSpeed() = " + man3.maxSwimSpeed());
        man3.swim();

        Runnable dog = new Dog();
        dog.run();
        System.out.println("dog.maxRunDistance() = " + dog.maxRunDistance());

        Walkable dog1 = new Dog();
        dog1.walk();

        Swimable dog2 = new Dog();
        dog2.swim();
        System.out.println("dog2.maxSwimSpeed() = " + dog2.maxSwimSpeed());

        Swimable fish = new Fish();
        System.out.println("fish.maxSwimSpeed() = " + fish.maxSwimSpeed());
        fish.swim();

        Flyable bird = new Bird();
        bird.fly();
        System.out.println("bird.flyMaxDistance() = " + bird.flyMaxDistance());

    }
}
