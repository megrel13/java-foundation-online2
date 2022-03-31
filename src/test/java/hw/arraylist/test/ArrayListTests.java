package hw.arraylist.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.arrayList.MyArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTests {

    @DisplayName("Проверяем методы get/add")
    @Test
    public void shouldHaveCorrectGetAndAddMethods () {

        MyArrayList list = new MyArrayList();
        list.add("elem1");
        list.add("elem2");

        assertEquals("elem1", list.get(0));
    }
    @DisplayName("Проверяем метод set")
    @Test
    public void shouldHaveCorrectSetMethod () {
        MyArrayList list = new MyArrayList();
        list.add("elem1");
        list.add("elem2");
        list.set(1, "element777");
        assertEquals("element777", list.get(1));
    }
    @DisplayName("Проверяем метод size")
    @Test
    public void shouldHaveCorrectSizeMethod () {
        MyArrayList list = new MyArrayList();
        list.add("elem1");
        list.add("elem2");
        list.size();
        assertEquals(2, list.size());

    }
    @DisplayName("Проверяем метод isEmpty")
    @Test
    public void shouldHaveCorrectIsEmptyMethod () {

        MyArrayList list = new MyArrayList();
        list.add("elem1");
        list.add("elem2");
        assertFalse(list.isEmpty());
    }
    @DisplayName("Проверяем метод contains")
    @Test
    public void shouldHaveCorrectContainsMethod () {

        MyArrayList list = new MyArrayList();
        list.add("elem1");
        list.add("elem2");

        assertTrue(list.contains("elem1"));
    }
    @DisplayName("Проверяем методы remove")
    @Test
    public void shouldHaveCorrectRemoveMethods () {

        MyArrayList list = new MyArrayList();
        list.add("elem1");
        list.add("elem2");
        list.add("elem3");

        list.remove(2);
        assertNull(list.get(2));

        assertTrue(list.remove("elem1"));
    }

    @DisplayName("Проверяем метод clear")
    @Test
    public void shouldHaveCorrectClearMethod () {

        MyArrayList list = new MyArrayList();
        list.add("elem1");
        list.add("elem2");
        list.add("elem3");

        list.clear();
        assertNull(null, "size () = 0");
    }

    @DisplayName("Проверяем методы indexOf/lastIndexOf")
    @Test
    public void shouldHaveCorrectIndexOfMethod () {

        MyArrayList list = new MyArrayList();
        list.add("elem1");
        list.add("elem2");
        list.add("elem3");

        assertEquals(0, list.indexOf("elem1"));
        assertEquals(1, list.lastIndexOf("elem2"));







    }
}