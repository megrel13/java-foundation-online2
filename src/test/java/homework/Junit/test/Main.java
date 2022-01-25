package homework.Junit.test;

import homework.Junit.Person;


public class Main {
    public static void main(String[] args) {
        Person person = new Person("Вася", 18);

        person.birthday();
        System.out.println("person.takeBeer() = " + person.takeBeer());

        System.out.println(person.getAge());
    }
}
