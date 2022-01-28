package homework.comparable;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person man1 = new Person("Вася", "Петров", 12);
        Person man2 = new Person("Петя", "Иванов", 17);
        Person man3 = new Person("Петя", "Иванов", 19);
        Person man4 = new Person("Леша", "Черданцев", 21);
        Person man5 = new Person("Леша", "Кошка", 21);
        Person man6 = new Person("Зена", "Васильев", 12);


        Person[] mans = {man1, man2, man3, man4, man5, man6};


        System.out.println("До сортировки: " + Arrays.toString(mans));
        Arrays.sort(mans);
        System.out.println("После сортироовки: " + Arrays.toString(mans));

        Person manClone = (Person) man1.clone();

        System.out.println("manClone = " + manClone);


    }

}
