package ru.itsjava.object;

public class ObjectPractice {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1 == obj2);

        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

        obj2 = obj1;

        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

        Dog zurka = new Dog("Журка", 4);
        Dog zurka2 = new Dog("Журка", 3);
        Dog murka = new Dog("Мурка", 4);

        System.out.println("zurka.equals(murka) = " + zurka.equals(zurka2));
        System.out.println("zurka.equals(murka) = " + zurka.equals(murka));

        System.out.println("zurka.equals(obj1) = " + zurka.equals(obj1));

        System.out.println("zurka.toString() = " + zurka.toString());
    }
}
