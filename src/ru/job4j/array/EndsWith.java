package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int index = 0; index < word.length - 1; index++) {
            for (int i = index; i < post.length; i++) {
                if (word[word.length - 1 - index] == post[post.length - 1 - i]) {
                    result = true;
                } else {
                   return result;
                }

            }
        }
        return result;
    }
}