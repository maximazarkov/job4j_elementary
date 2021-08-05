package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogicNotTest {

    @Test
    public void whenNumIsEvenAndNegativeThenNotEvenAndPositiveIsFalse() {
        boolean expected = false;
        int num = -2;
        boolean out = LogicNot.notEvenAndPositive(num);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNumNotEvenAndNegativeThenNotEvenAndPositiveIsFalse() {
        boolean expected = false;
        int num = -1;
        boolean out = LogicNot.notEvenAndPositive(num);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNumNotEvenAndPositiveThenNotEvenAndPositiveIsTrue() {
        boolean expected = true;
        int num = 1;
        boolean out = LogicNot.notEvenAndPositive(num);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNumIsEvenAndPositiveThenNotEvenAndPositiveIsFalse() {
        boolean expected = false;
        int num = 2;
        boolean out = LogicNot.notEvenAndPositive(num);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNumIsEvenAndNegativeThenEvenOrNotPositiveIsTrue() {
        boolean expected = true;
        int num = -2;
        boolean out = LogicNot.evenOrNotPositive(num);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNumNotEvenAndNegativeThenEvenOrNotPositiveIsTrue() {
        boolean expected = true;
        int num = -1;
        boolean out = LogicNot.evenOrNotPositive(num);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNumNotEvenAndPositiveThenEvenOrNotPositiveIsFalse() {
        boolean expected = false;
        int num = 1;
        boolean out = LogicNot.evenOrNotPositive(num);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNumIsEvenAndPositiveThenEvenOrNotPositiveIsTrue() {
        boolean expected = true;
        int num = 2;
        boolean out = LogicNot.evenOrNotPositive(num);
        Assert.assertEquals(expected, out);
    }
}