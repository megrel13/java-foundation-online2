package homework.сollections.lists;

import java.util.ArrayList;
import java.util.List;

public class BooksMain {
    public static void main(String[] args) {
        //   0. Создание списков: (Используя конструктор)
        // а). Создать пустой список книг
        //б). Создать список размером 20
        List<Book> booksList = new ArrayList<>();
        List<Book> booksList1 = new ArrayList<>(19);

        //   1. Задачи на вставку элемента:
        // а) Добавить подряд 5 элементов.
        booksList.add(new Book("Гибель богов", "Перумов", 340));
        booksList.add(new Book("Череп на рукаве", "Перумов", 420));
        booksList.add(new Book("Властелин колец", "Толкин", 540));
        booksList.add(new Book("Сильмариллион", "Толкин", 1500));
        booksList.add(new Book("Рабыня", "Конклин", 210));

        System.out.println("booksList.size() = " + booksList.size());

        //  б) Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.
        booksList.add(2, new Book("Незнайка", "Носов", 270));
        booksList.add(0, new Book("Война и Мир", "Толстой", 1400));

        // в) Записать в новый список все элементы предыдущего списка.

        booksList1.addAll(booksList);

        for (Book bookElem : booksList1
        ) {
            System.out.println(bookElem);
        }
        // 2. Получить элемент по индексу:
        // а). Получить первый элемент (первую книгу в списке)
        System.out.println("booksList.get(0) = " + booksList.get(0));
        // б). Получить последний элемент (последнюю книгу в списке)
        System.out.println("booksList.get(booksList.size()-1) = " + booksList.get(booksList.size() - 1));

        //3. Задачи на удаление элементов: (Используя методы)
        //а) Удалить элемент по значению (книге)
        Book star = new Book("Звезда", "Рупынина", 180);
        booksList.add(star);
        System.out.println("booksList.contains(star) = " + booksList.contains(star));
        booksList.remove(star);
        System.out.println("booksList.contains(star) = " + booksList.contains(star));
        //б) Удалить элемент по индексу
        booksList.remove(3);
        booksList1.addAll(booksList);

        for (Book bookElem : booksList1
        ) {
            System.out.println(bookElem);
        }

        //  4. Проверить наличие элемента
        System.out.println("booksList.contains(star) = " + booksList.contains(star));

        // 5. Вывод списка:
        // а) Вывести список на экран в формате: List: [ Book{"7 навыков высокоэффективных людей", "Кови",
        // 387};Book {"Java. Эффективное программирование", "Блох Дж.", 219} ;]

        for (Book bookElem : booksList1
        ) {
            System.out.print(bookElem + ", ");
        }

        //Теперь надо хаотично в список добавить 4 книги с названием "Java"

        Book java = new Book("Java", "Компир", 32);
        Book java1 = new Book("Java1", "Вомпир", 44);
        Book java2 = new Book("Java2", "Корип", 555);
        Book java3 = new Book("Java3", "Гудип", 88);

        booksList.add(3, java);
        booksList.add(5, java1);
        booksList.add(8, java2);
        booksList.add(1, java3);

        //6. Отфильтровать список вернуть записи по некоторому условию:
        //а) Условие на индекс: Индекс делится на 3

        for (int i = 0; i < booksList.size(); i++) {
            if ((i % 3) != 0) {
                System.out.println(booksList.get(i));
            }
        }

        //б) Условие на значение: Вернуть количество книг, которые равны "Java"

        for (Book bookElem : booksList
        ) {
         if(booksList.contains(java)) {

            }

        }
        //7. Пропустить несколько первых элементов
        //
        //а) Пропустить первые 3 книги в списке.
        //
        //
        //6 + 7: Пропускаем элементы, которые удовлетворяют некоторому условию
        //
        //а) Пропустить первые 2 книги, которые равные "Java"
        //
        //
        //8. Вернуть первый подходящий элемент:
        //
        //а) Возвращаем первую книгу, длина автора которого делится на 3.
        //
        //
        //9. Возвращаем все элементы удовлетворяющие условию:
        //
        //а) Возвращаем все книги, длина автора которых делится на 3.

    }
}
