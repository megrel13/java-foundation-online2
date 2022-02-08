package homework.сollections.lists;

import java.util.ArrayList;
import java.util.List;

public class BooksMain {
    public static void main(String[] args) {
        //   0. Создание списков: (Используя конструктор)
        // а). Создать пустой список книг
        //б). Создать список размером 20
        System.out.println("Создать пустой список книг");
        List<Book> booksList = new ArrayList<>();
        System.out.println("Создать список размером 20");
        List<Book> booksList1 = new ArrayList<>(19);

        //   1. Задачи на вставку элемента:
        // а) Добавить подряд 5 элементов.
        System.out.println("Добавить подряд 5 элементов.");
        booksList.add(new Book("Гибель богов", "Перумов", 340));
        booksList.add(new Book("Череп на рукаве", "Перумов", 420));
        booksList.add(new Book("Властелин колец", "Толкин", 540));
        booksList.add(new Book("Сильмариллион", "Толкин", 1500));
        booksList.add(new Book("Рабыня", "Конклин", 210));

        System.out.println("booksList.size() = " + booksList.size());

        //  б) Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.
        System.out.println("Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.");
        booksList.add(2, new Book("Незнайка", "Носов", 270));
        booksList.add(0, new Book("Война и Мир", "Толстой", 1400));

        // в) Записать в новый список все элементы предыдущего списка.
        System.out.println("Записать в новый список все элементы предыдущего списка.");

        booksList1.addAll(booksList);

        for (Book bookElem : booksList1
        ) {
            System.out.println(bookElem);
        }
        // 2. Получить элемент по индексу:
        // а). Получить первый элемент (первую книгу в списке)
        System.out.println("Получить первый элемент (первую книгу в списке)");
        System.out.println("booksList.get(0) = " + booksList.get(0));
        // б). Получить последний элемент (последнюю книгу в списке)
        System.out.println("Получить последний элемент (последнюю книгу в списке)");
        System.out.println("booksList.get(booksList.size()-1) = " + booksList.get(booksList.size() - 1));

        //3. Задачи на удаление элементов: (Используя методы)
        //а) Удалить элемент по значению (книге)
        System.out.println("Удалить элемент по значению (книге)");
        Book star = new Book("Звезда", "Рупынина", 180);
        booksList.add(star);
        System.out.println("booksList.contains(star) = " + booksList.contains(star));
        booksList.remove(star);
        System.out.println("booksList.contains(star) = " + booksList.contains(star));
        //б) Удалить элемент по индексу
        System.out.println("Удалить элемент по индексу");
        booksList.remove(3);
        booksList1.addAll(booksList);

        for (Book bookElem : booksList1) {
            System.out.println(bookElem);
        }

        //  4. Проверить наличие элемента
        System.out.println("Проверить наличие элемента: ");
        System.out.println("booksList.contains(star) = " + booksList.contains(star));

        // 5. Вывод списка:
        // а) Вывести список на экран в формате: List: [ Book{"7 навыков высокоэффективных людей", "Кови",
        // 387};Book {"Java. Эффективное программирование", "Блох Дж.", 219} ;]
        System.out.println("Вывести список на экран в формате:");
        for (Book bookElem : booksList1) {
            System.out.print(bookElem + ", ");
        }

        //Теперь надо хаотично в список добавить 4 книги с названием "Java"
        System.out.println("Теперь надо хаотично в список добавить 4 книги с названием \"Java\"");
        Book java = new Book("Java", "Компир", 32);
        Book java1 = new Book("Java", "Вомпир", 44);
        Book java2 = new Book("Java", "Ко", 555);
        Book java3 = new Book("Java", "Гудип", 88);

        booksList.add(3, java);
        booksList.add(5, java1);
        booksList.add(8, java2);
        booksList.add(1, java3);

        //6. Отфильтровать список вернуть записи по некоторому условию:
        //а) Условие на индекс: Индекс делится на 3
        System.out.println("Условие на индекс: Индекс делится на 3");
        for (int i = 0; i < booksList.size(); i++) {
            if ((i % 3) != 0) {
                System.out.println(booksList.get(i));
            }
        }

        //б) Условие на значение: Вернуть количество книг, которые равны "Java"
        System.out.println("Условие на значение: Вернуть количество книг, которые равны \"Java\"");
        for (Book bookElemContJava : booksList) {
            if (bookElemContJava.getTitle().contains("Java")) {
                System.out.println(bookElemContJava);
            }
        }
        //7. Пропустить несколько первых элементов
        //а) Пропустить первые 3 книги в списке.
        System.out.println("Пропустить первые 3 книги в списке.");
        for (int i = 3; i < booksList.size(); i++) {
            System.out.println(booksList.get(i));
        }

        System.out.println("Вывод листа ");
        for (Book bookElem : booksList) {
            System.out.println(bookElem);

        }


        //6 + 7: Пропускаем элементы, которые удовлетворяют некоторому условию
        //а) Пропустить первые 2 книги, которые равные "Java"
        System.out.println("Пропустить первые 2 книги, которые равные \"Java\"");
        int bookSearchEnd = 0;
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getTitle().contains("Java") && bookSearchEnd < 2) {
                bookSearchEnd++;
            } else System.out.println(booksList.get(i));
        }
        //8. Вернуть первый подходящий элемент:
        //а) Возвращаем первую книгу, длина автора которого делится на 3.
        System.out.println("Возвращаем первую книгу, длина автора которого делится на 3.");

        for (Book bookFirst : booksList) {
            if ((bookFirst.getTitle().length() % 3) != 0) {
                System.out.println(bookFirst);
                break;
            }
        }
        //9. Возвращаем все элементы удовлетворяющие условию:
        //а) Возвращаем все книги, длина автора которых делится на 3.
        System.out.println("Возвращаем все книги, длина автора которых делится на 3.");
        for (Book bookFirst : booksList) {
            if ((bookFirst.getTitle().length() % 3) != 0) {
                System.out.println(bookFirst);
            }
        }
    }
}

