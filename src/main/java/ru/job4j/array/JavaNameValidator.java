package ru.job4j.array;

public class JavaNameValidator {
    /**
     * метод для проверки валидности имен в языке Java
     * @param name - код символа
     * @return - возвращает true, если символ валидный
     */
    public static boolean isNameValid(String name) {
        boolean result = false;
        if (!name.isEmpty()
                && !Character.isUpperCase(name.codePointAt(0))
                && !Character.isDigit(name.codePointAt(0))
        ) {
            for (int i = 0; i < name.length(); i++) {
                int code = name.codePointAt(i);
                result = isSpecialSymbol(code)
                        || isLowerLatinLetter(code)
                        || isUpperLatinLetter(code)
                        || Character.isDigit(code);
                if (result) {
                    break;
                }
            }
        }
        return result;
    }

    /**
     * метод должен вернуть true, если символ является символом доллара и нижнее подчеркивание
     * @param code - код символа
     * @return - должен вернуть true, если символ является символом доллара и нижнее подчеркивание
     */
    private static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    /**
     * метод должен вернуть true, если символ является прописным латинским символом;
     * @param code - код символа
     * @return - должен вернуть true, если символ является прописным латинским символом
     */
    private static boolean isUpperLatinLetter(int code) {
        return code < 65 || code > 90;
    }

    /**
     * метод должен вернуть true, если символ является строчным латинским символом
     * @param code - код символа
     * @return - должен вернуть true, если символ является строчным латинским символом.
     */
    private static boolean isLowerLatinLetter(int code) {
        return code < 97 || code > 122;
    }
}
