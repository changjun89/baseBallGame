package nextstep.view;


import nextstep.Result;

public class OutputView {

    public static final String ONLY_STRIKE_FORMAT = "%d 스트크라이크 ";
    public static final String ONLY_BALL_FORMAT = "%d 볼";
    public static final String NO_STRIKE_NO_BALL = "포볼";

    public static void printResult(Result result) {
        int strikeCnt = result.getStrikeCount();
        int ballCnt = result.getBallCount();
        printStrikeCount(strikeCnt);
        printBallCount(ballCnt);
        printFourBall(strikeCnt, ballCnt);
        System.out.println();
    }


    private static void printStrikeCount(int strikeCnt) {
        if (strikeCnt > 0) {
            System.out.printf(ONLY_STRIKE_FORMAT, strikeCnt);
        }
    }

    private static void printBallCount(int ballCnt) {
        if (ballCnt > 0) {
            System.out.printf(ONLY_BALL_FORMAT, ballCnt);
        }
    }

    private static void printFourBall(int strikeCnt, int ballCnt) {
        if (strikeCnt + ballCnt == 0) {
            System.out.println(NO_STRIKE_NO_BALL);
        }
    }
}