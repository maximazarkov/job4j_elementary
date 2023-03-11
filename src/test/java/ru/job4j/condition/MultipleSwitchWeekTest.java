package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayThen1() {
        String name = "Понедельник";
        int out = MultipleSwitchWeek.numberOfDay(name);
        assertThat(out).isEqualTo(1);
    }

    @Test
    public void whenThursdayThen4() {
        String name = "Thursday";
        int out = MultipleSwitchWeek.numberOfDay(name);
        assertThat(out).isEqualTo(4);
    }
}