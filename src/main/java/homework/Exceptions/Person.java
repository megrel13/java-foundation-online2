package homework.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public class Person {
    public String name;
    public int age;

    public int getAge() throws AgeNotValidException {
        if (age < 0 || age > 150) {
            throw new AgeNotValidException("Не корректное значение возраста: " + age);
        }
        return age;
    }

    public static void main(String[] args) throws AgeNotValidException {

        Person person = new Person("Майк", 20);
        Person person1 = new Person("Бенджамин", -1);
        Person person2 = new Person("Дориан", 151);


        System.out.println(person.getAge());
        System.out.println(person1.getAge());
        System.out.println(person2.getAge());

    }

}

