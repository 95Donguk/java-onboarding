package onboarding;

import java.util.List;
import java.util.stream.IntStream;

public class Problem3 {
    private static final int START_NUMBER = 1;

    public static void main(String[] args) {
        List<Integer> numbers = List.of(13, 33);
        System.out.printf("%-10s|%-10s|", "number", "result");
        printLine();
        numbers.forEach(number -> {
            System.out.printf("%-10d|%-10d|", number, solution(number));
            printLine();
        });
    }

    private static void printLine() {
        System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
    }

    public static int solution(int number) {
        int answer = 0;
        Number.validate(number);
        answer = findResult(number);
        return answer;
    }

    private static int findResult(int number) {
        return IntStream.rangeClosed(START_NUMBER, number)
                .map(Number::countClapOfNumber)
                .sum();
    }

    static class Number {
        private static final int MIN_NUMBER_RANGE = 1;
        private static final int MAX_NUMBER_RANGE = 100;
        private static final int THREE = 3;
        private static final int SIX = 6;
        private static final int NINE = 9;

        public static int countClapOfNumber(int number) {
            int clap = 0;
            for (int i = number; i > 0; i = i / 10) {
                if (hasThreeOrSixOrNine(i % 10)) {
                    clap++;
                }
            }
            return clap;
        }

        private static boolean hasThreeOrSixOrNine(int digit) {
            return isThree(digit) || isSix(digit) || isNine(digit);
        }

        private static boolean isThree(int digit) {
            return digit == THREE;
        }

        private static boolean isSix(int digit) {
            return digit == SIX;
        }

        private static boolean isNine(int digit) {
            return digit == NINE;
        }

        public static void validate(int number) {
            if (checkNumberRange(number)) {
                throw new IllegalArgumentException(
                        "The number should be a natural number between 1 and 10,000");
            }
        }

        private static boolean checkNumberRange(int number) {
            return number < MIN_NUMBER_RANGE || number > MAX_NUMBER_RANGE;
        }
    }
}
