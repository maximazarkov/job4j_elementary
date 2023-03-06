package ru.job4j.condition;

public class OperatorsRunner {
    public static void main(String[] args) {
        int first = 2;
        int second = 10;
        int result = first + second;
        System.out.println("Result sum: " + result);
        result = second - first;
        System.out.println("Result subtract: " + result);
        result = first * second;
        System.out.println("Result multiply: " + result);
        result = second / first;
        System.out.println("Result divide: " + result);
        first = 2;
        second = 10;
        System.out.println("Remainder after division: " + second % first);
        second = 7;
        System.out.println("Remainder after division: " + second % first);
        int i = 1234;
        int thousands = i / 1000;
        int hundreds = i % 1000 / 100;
        int tens = i % 100 / 10;
        int ones = i % 10;
        System.out.println(
                "Thousands: " + thousands
                        + ", Hundreds: " + hundreds
                        + ", Tens: " + tens
                        + ", Ones: " + ones
        );
        i = 100;
        System.out.println("Before increment: " + i);
        i++;
        System.out.println("After increment: " + i);
        i--;
        System.out.println("After decrement: " + i);
    }
}
