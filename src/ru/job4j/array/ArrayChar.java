package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < word.length; index++) {
            for (int i = index; i < pref.length; i++) {
                if (pref[index] == word[i]) {
                    result = true;
                    break;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}