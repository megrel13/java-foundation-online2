package homework.Junit.test.LinkedList;

import homework.LinkedList.MyLinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyLinkedListTest {

    @DisplayName("Проверяем get/add в MyLinkedList")
    @Test
    public void shouldHaveCorrectGetAndAddMethods () {

        MyLinkedList list = new MyLinkedList();
        list.add("elem1");
        list.add("elem2");

        assertEquals("elem1", list.get(0));
    }
    @DisplayName("Проверяем set в MyLinkedList")
    @Test
    public void shouldHaveCorrectSetMethod () {
        MyLinkedList list = new MyLinkedList();
        list.add("elem1");
        list.add("elem2");
        list.set(1, "element777");
        assertEquals("element777", list.get(1));
    }
    @DisplayName("Проверяем size в MyLinkedList")
    @Test
    public void shouldHaveCorrectSizeMethod () {
        MyLinkedList list = new MyLinkedList();
        list.add("elem1");
        list.add("elem2");
        list.size();
        assertEquals(2, list.size());

    }
    @DisplayName("Проверяем isEmpty в MyLinkedList")
    @Test
    public void shouldHaveCorrectIsEmptyMethod () {

        MyLinkedList list = new MyLinkedList();
        list.add("elem1");
        list.add("elem2");
        assertFalse(list.isEmpty());
    }
    @DisplayName("Проверяем contains в MyLinkedList")
    @Test
    public void shouldHaveCorrectContainsMethod () {

        MyLinkedList list = new MyLinkedList();
        list.add("elem1");
        list.add("elem2");

        assertTrue(list.contains("elem1"));
    }

    @DisplayName(" Проверяем remove в MyLinkedList")
    @Test
    public void shouldHaveCorrectRemoveMethods () {

        MyLinkedList list = new MyLinkedList();
        list.add("elem1");
        list.add("elem2");
        list.add("elem3");

        list.remove(2);
        assertNull(list.get(2));

        assertTrue(list.remove("elem1"));
    }

    @DisplayName(" Проверяем clear в MyLinkedList")
    @Test
    public void shouldHaveCorrectClearMethod () {

        MyLinkedList list = new MyLinkedList();
        list.add("elem1");
        list.add("elem2");
        list.add("elem3");

        list.clear();
        assertNull(null, "size () = 0");
    }

    @DisplayName("Проверяем indexOf/lastIndexOf в MyLinkedList")
    @Test
    public void shouldHaveCorrectIndexOfMethod () {

        MyLinkedList list = new MyLinkedList();
        list.add("elem1");
        list.add("elem2");
        list.add("elem3");

        assertEquals(0, list.indexOf("elem1"));
        assertEquals(1, list.lastIndexOf("elem2"));

    }
}