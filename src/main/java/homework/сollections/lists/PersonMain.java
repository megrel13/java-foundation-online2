package homework.сollections.lists;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {

    public static void main(String[] args) {
        // 10. Создать класс Person.( Поля: имя, возраст и пол isMale )
        List<Person> personList = new ArrayList<>();

        Person man1 = new Person("Вася", 28, true);
        Person man2 = new Person("Петя", 17, true);
        Person man3 = new Person("Никита", 26, true);

        Person woman1 = new Person("Настя", 27, false);
        Person woman2 = new Person("Лукреция", 21, false);
        Person woman3 = new Person("Екатерина", 32, false);

        personList.add(man1);
        personList.add(man2);
        personList.add(man3);
        personList.add(woman1);
        personList.add(woman2);
        personList.add(woman3);

        System.out.println("Вывести весь лист: ");
        for (Person persons : personList) {
            System.out.println(persons);
        }

        // Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на 'Н'
        System.out.println("Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18" +
                " и имя которых начинается на 'Н'");

        for (Person personForArmy : personList) {
            if (personForArmy.isMale() == true && personForArmy.getAge() < 27 && personForArmy.getAge() > 18 &&
                    personForArmy.getName().contains("Н")) {
                System.out.println(personForArmy);
            }

        }
        // 11. Найти средний возраст всех женщин.
        System.out.println("Найти средний возраст всех женщин.");
        int sumAge = 0;
        int countWoman = 0;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).isMale == false) {
                countWoman++;
                sumAge = sumAge + personList.get(i).getAge();
            }
        }
        System.out.println("Количество женщин: " + countWoman);
        System.out.println("Сумма возрастов женщин: " + sumAge);
        int avarageWomanAge = (sumAge / countWoman);
        System.out.println("Средний возраст женщин: " + avarageWomanAge);
    }
}
