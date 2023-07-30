package onboarding;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Problem2 {
    public static void main(String[] args) {
        List<String> cryptograms = List.of("browoanoommnaon", "zyelleyz");
        System.out.printf("%-30s|%-30s|", "cryptogram", "result");
        printLine();
        cryptograms.forEach(cryptogram -> {
            System.out.printf("%-30s|%-30s|", "\"" + cryptogram + "\"",
                    "\"" + solution(cryptogram) + "\"");
            printLine();
        });
    }

    private static void printLine() {
        System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
    }

    public static String solution(String cryptogram) {
        String answer = "answer";
        CryptogramValidator.checkException(cryptogram);
        answer = decrypt(cryptogram);
        return answer;
    }

    private static String decrypt(String cryptogram) {
        List<Character> characters = new LinkedList<>();

        splitString(cryptogram, characters);
        removeDuplicateChar(characters);
        return combineChar(characters);
    }

    private static String combineChar(List<Character> charListcharacters) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : charListcharacters) {
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }

    private static void removeDuplicateChar(List<Character> characters) {
        for (int i = 1; i < characters.size(); i++) {
            if (isDuplicate(characters, i)) {
                characters.remove(i - 1);
                characters.remove(i - 1);
                i = 0;
            }
        }
    }

    private static boolean isDuplicate(List<Character> characters, int i) {
        return Objects.equals(characters.get(i - 1), characters.get(i));
    }

    private static void splitString(String cryptogram, List<Character> characters) {
        char[] chars = cryptogram.toCharArray();
        for (char aChar : chars) {
            characters.add(aChar);
        }
    }

    private static class CryptogramValidator {
        private static final int MIN_CRYPTOGRAM_LENGTH = 1;
        private static final int MAX_CRYPTOGRAM_LENGTH = 1000;

        public static void checkException(String cryptogram) {
            if (isNull(cryptogram) || checkLengthOfCryptogram(cryptogram)) {
                throw new IllegalArgumentException(
                        "The cryptogram's length should be between 1 and 1000.");
            }
            if (isUpperCase(cryptogram)) {
                throw new IllegalArgumentException("The cryptogram should be lowercase.");
            }
        }

        private static boolean isNull(String cryptogram) {
            return Objects.isNull(cryptogram);
        }

        private static boolean checkLengthOfCryptogram(String cryptogram) {
            return cryptogram.length() < MIN_CRYPTOGRAM_LENGTH ||
                    cryptogram.length() > MAX_CRYPTOGRAM_LENGTH;
        }

        private static boolean isUpperCase(String cryptogram) {
            char[] chars = cryptogram.toCharArray();
            for (char aChar : chars) {
                if (Character.isUpperCase(aChar)) {
                    return true;
                }
            }
            return false;
        }
    }
}
