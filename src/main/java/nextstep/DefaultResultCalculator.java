package nextstep;

public class DefaultResultCalculator implements ResultCalculator {

    @Override
    public Result calculate(Integer[] computerNumbers, Integer[] userNumbers) {
        Integer StrikeCount = calculateStrike(computerNumbers, userNumbers);
        Integer ballCount = calculateBall(computerNumbers, userNumbers);
        return new Result(StrikeCount, ballCount);
    }

    private Integer calculateBall(Integer[] computerNumbers, Integer[] userNumbers) {
        int result = 0;
        for (int i = 0; i < computerNumbers.length; i++) {
            result += addBallCount(computerNumbers, userNumbers[i], i);
        }
        return result;
    }

    private int addBallCount(Integer[] computerNumbers, Integer userNumber, Integer idx) {
        int addedBallCnt = 0;
        if (computerNumbers[idx].equals(userNumber)) {
            return addedBallCnt;
        }

        for (int computerNumber : computerNumbers) {
            addedBallCnt += isSameNumber(userNumber, computerNumber);
        }
        return addedBallCnt;
    }

    private int isSameNumber(Integer userNumber, Integer computerNumber) {
        if (computerNumber.equals(userNumber)) {
            return 1;
        }
        return 0;
    }

    private Integer calculateStrike(Integer[] computerNumbers, Integer[] userNumbers) {
        int result = 0;
        for (int i = 0; i < computerNumbers.length; i++) {
            result += isSameNumber(computerNumbers[i], userNumbers[i]);
        }
        return result;
    }
}
