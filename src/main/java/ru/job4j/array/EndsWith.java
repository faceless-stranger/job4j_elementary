package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < word.length && i < post.length; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean test = EndsWith.endsWith(word, post);
        System.out.println(test);
    }
}