package homework.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class SetPractice {
    public static void main(String[] args) {

        Fruit pineapple = new Fruit("Pineapple", 14.7);
        Fruit lemon = new Fruit("Lemon", 11.2);
        Fruit apple = new Fruit("Apple", 6.2);

        Set<Fruit> setFruit = new HashSet<>(Arrays.asList(pineapple, lemon, apple));
        System.out.println("setFruit = " + setFruit);

        Fruit watermelon = new Fruit("Watermelon", 24.1);
        setFruit.add(watermelon);
        System.out.println("setFruit = " + setFruit);

        Fruit lemon2 = new Fruit("Lemon", 11.2);

        System.out.println("setFruit.add(lemon2) = " + setFruit.add(lemon2));
        System.out.println("setFruit.contains(lemon2) = " + setFruit.contains(lemon2));

        System.out.println("setFruit.remove(lemon2) = " + setFruit.remove(lemon2));
        System.out.println("setFruit = " + setFruit);

        System.out.println("setFruit.remove(lemon2) = " + setFruit.remove(lemon2));
        System.out.println("setFruit = " + setFruit);

        System.out.println("setFruit.contains(lemon2) = " + setFruit.contains(lemon2));


    }
}
