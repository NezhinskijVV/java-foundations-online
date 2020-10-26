package ru.itsjava.collections.lists;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс Watch должен: ")
public class WatchTest {

    public static final String DEFAULT_FIRM = "SEIKO";
    public static final String DEFAULT_AUTHOR = "Vova";
    public static final double DEFAULT_PRICE = 10000.0;
    public static final String NEW_AUTHOR = "Masha";

    @DisplayName(" корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Watch actualWatch = new Watch(DEFAULT_FIRM, DEFAULT_AUTHOR, DEFAULT_PRICE);

//        assertEquals(DEFAULT_FIRM, actualWatch.getFirm());
//        assertEquals(DEFAULT_AUTHOR, actualWatch.getAuthor());
//        assertEquals(DEFAULT_PRICE, actualWatch.getPrice());

        assertAll("actualWatch", () -> assertEquals(DEFAULT_FIRM, actualWatch.getFirm()),
                () -> assertEquals(DEFAULT_AUTHOR, actualWatch.getAuthor()),
                () -> assertEquals(DEFAULT_PRICE, actualWatch.getPrice()));
    }

    @DisplayName(" корректно изменять автора")
    @Test
    public void shouldHaveCorrectUpdateWatch() {
        Watch actualWatch = new Watch(DEFAULT_FIRM, DEFAULT_AUTHOR, DEFAULT_PRICE);
        actualWatch.setAuthor(NEW_AUTHOR);
        assertEquals(NEW_AUTHOR, actualWatch.getAuthor());
    }

    
}
