package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        /* проверим. что массив word имеет последние элементы одинаковые с post */
        /* выполним согласно требованию прямого перебора*/
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - i - 1] != post[post.length - i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
