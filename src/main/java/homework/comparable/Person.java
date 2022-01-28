package homework.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person implements Comparable<Person>, Cloneable {

    private String name;
    private String surname;
    private int age;

    @Override
    public int compareTo(Person person) {
     int sortPersons = surname.compareTo(person.surname);
     if (sortPersons == 0) {
         sortPersons = name.compareTo(person.name);
        }
     if (sortPersons == 0) {
         sortPersons = Integer.compare(age, person.age);
     }
        return sortPersons;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
