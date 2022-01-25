package homework.Junit.test;

import homework.Junit.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Класс должен содержать: ")
public class PersonTest {

    public static final String DEFAULT_NAME = "Вася";
    public static final int DEFAULT_AGE = 18;

    @DisplayName(" корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

        assertAll("actualPerson", () -> assertEquals(DEFAULT_NAME, actualPerson.getName()),
                () -> assertEquals(DEFAULT_AGE, actualPerson.getAge()));

    }

    @DisplayName(" корректно прибавлять возраст на день рождения")
    @Test
    public void shouldHaveCorrectBirthday() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.birthday();
        assertEquals(DEFAULT_AGE + 1, actualPerson.getAge());
    }

    @DisplayName(" корректно проверять возраст для продажи алкоголя")
    @Test
    public void shouldHaveCorrectTakeBear() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.takeBeer();
        assertTrue(DEFAULT_AGE >= 18);
    }
}
