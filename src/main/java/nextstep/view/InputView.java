package nextstep.view;

import java.util.Scanner;

public class InputView {

    public static final String ASK_NUMBERS = "숫자를 입력해주세요:";
    public static final String ASK_NEW_GAME_OR_END = "3개의 숫자를 모두 맞히셨습니다! 게임종료 \n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    static final Scanner scanner = new Scanner(System.in);

    public static Integer[] askNumbers() {
        System.out.println(ASK_NUMBERS);
        String numbers = scanner.next();

        return convertToIntegerArr(numbers);
    }

    private static Integer[] convertToIntegerArr(String numbers) {
        Integer[] userNumbers = new Integer[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            userNumbers[i] = Character.getNumericValue(numbers.charAt(i));
        }
        return userNumbers;
    }

    public static String askNewGameOrEnd() {
        System.out.println(ASK_NEW_GAME_OR_END);
        String numbers = scanner.next();
        return numbers;
    }
}