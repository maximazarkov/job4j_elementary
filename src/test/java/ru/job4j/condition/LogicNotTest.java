package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class LogicNotTest {

    @Test
    public void whenNumIsEvenAndNegativeThenNotEvenAndPositiveIsFalse() {
        int num = -2;
        boolean out = LogicNot.notEvenAndPositive(num);
        assertThat(out).isEqualTo(false);
    }

    @Test
    public void whenNumNotEvenAndNegativeThenNotEvenAndPositiveIsFalse() {
        int num = -1;
        boolean out = LogicNot.notEvenAndPositive(num);
        assertThat(out).isEqualTo(false);
    }

    @Test
    public void whenNumNotEvenAndPositiveThenNotEvenAndPositiveIsTrue() {
        int num = 1;
        boolean out = LogicNot.notEvenAndPositive(num);
        assertThat(out).isEqualTo(true);
    }

    @Test
    public void whenNumIsEvenAndPositiveThenNotEvenAndPositiveIsFalse() {
        int num = 2;
        boolean out = LogicNot.notEvenAndPositive(num);
        assertThat(out).isEqualTo(false);
    }

    @Test
    public void whenNumIsEvenAndNegativeThenEvenOrNotPositiveIsTrue() {
        int num = -2;
        boolean out = LogicNot.evenOrNotPositive(num);
        assertThat(out).isEqualTo(true);
    }

    @Test
    public void whenNumNotEvenAndNegativeThenEvenOrNotPositiveIsTrue() {
        int num = -1;
        boolean out = LogicNot.evenOrNotPositive(num);
        assertThat(out).isEqualTo(true);
    }

    @Test
    public void whenNumNotEvenAndPositiveThenEvenOrNotPositiveIsFalse() {
        int num = 1;
        boolean out = LogicNot.evenOrNotPositive(num);
        assertThat(out).isEqualTo(false);
    }

    @Test
    public void whenNumIsEvenAndPositiveThenEvenOrNotPositiveIsTrue() {
        int num = 2;
        boolean out = LogicNot.evenOrNotPositive(num);
        assertThat(out).isEqualTo(true);
    }
}