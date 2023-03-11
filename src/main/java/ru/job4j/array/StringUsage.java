package ru.job4j.array;

public class StringUsage {
    public static void main(String[] args) {
        String text = "Smith Will";
        char[] array = text.toCharArray();
        System.out.println(array);
        char surnameStrar = text.charAt(6);
        System.out.println(surnameStrar);
        String subtext = "Wi";
        int index = text.indexOf(subtext);
        System.out.println(index);
        text = "Smith Will, He has a friend William.";
        index = text.indexOf(subtext, 7);
        System.out.println(index);
        text = "will_smith@gmail.com";
        int mailIndex = text.indexOf("@") + 1;
        int end = text.length();
        String domain = text.substring(mailIndex, end);
        System.out.println(domain);
        array = new char[]{'j', 'o', 'b', '4', 'j'};
        text = String.valueOf(array);
        System.out.println(text);

        validatePhone("123456789");
        validatePhone("123-456-789");
    }

    private static void validatePhone(String s) {
        boolean valid = true;
        for (int i = 0; i < s.length(); i++) {
            int code = s.codePointAt(i);
            if (code < 48 || code > 57) {
                valid = false;
                break;
            }
        }
        System.out.println(s + " is " + ((valid) ? "correct" : "not correct"));
    }
}
