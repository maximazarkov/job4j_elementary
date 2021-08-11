package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        /* заполним массив через цикл элементами от 1 до bound возведенными в квадрат */
            for (int index = 0; index < bound; index++) {
                rst[index] = (int) Math.pow(index,2);
            }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
