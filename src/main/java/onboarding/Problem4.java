package onboarding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem4 {
    public static void main(String[] args) {
        String word = "I love you";
        System.out.printf("%-30s|%-30s|", "word", "result");
        System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.printf("%-30s|%-30s|", "\"" + word + "\"", "\"" + solution(word) + "\"");
    }

    public static String solution(String word) {
        String answer = "";
        List<Character> letters = new ArrayList<>();
        Word.validate(word);
        splitWord(word, letters);
        letters = replaceLetters(letters);
        answer = combineLetter(letters);
        return answer;
    }

    private static String combineLetter(List<Character> letters) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character letter : letters) {
            stringBuilder.append(letter);
        }
        return stringBuilder.toString();
    }

    private static List<Character> replaceLetters(List<Character> letters) {
        return letters.stream()
                .map(Problem4::transformFromOnlyAlphabet)
                .collect(Collectors.toList());
    }

    private static Character transformFromOnlyAlphabet(Character letter) {
        if (Character.isAlphabetic(letter)) {
            return transformCharacter(letter);
        }
        return letter;
    }

    private static Character transformCharacter(Character letter) {
        boolean isLowerCase = Character.isLowerCase(letter);
        if (isLowerCase) {
            char uppercaseLetter = Character.toUpperCase(letter);
            letter = convertForLetter(uppercaseLetter);
            return Character.toLowerCase(letter);
        }
        return convertForLetter(letter);
    }

    private static Character convertForLetter(char letter) {
        return (char) ('A' + 'Z' - letter);
    }

    private static List<Character> splitWord(String word, List<Character> letters) {
        char[] chars = word.toCharArray();
        for (char aChar : chars) {
            letters.add(aChar);
        }
        return letters;
    }

    private static class Word {
        private static final int MAX_WORD_LENGTH = 1000;

        public static void validate(String word) {
            if (checkLengthOfWord(word)) {
                throw new IllegalArgumentException(
                    "The word's length should be greater than or equal to 1, and less than or equal to 1,000.");
            }
        }

        private static boolean checkLengthOfWord(String word) {
            return word.isEmpty() || word.length() > MAX_WORD_LENGTH;
        }
    }
}