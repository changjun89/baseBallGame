package nextstep;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomComputerNumberGenerator implements ComputerNumbersGenerator {
    @Override
    public Integer[] generate() {
        Integer[] result = new Integer[BaseBallGameConst.BASE_BALL_NUMBERS_SIZE];

        Set<Integer> uniqueNumbers = new HashSet<>();
        while (uniqueNumbers.size() < BaseBallGameConst.BASE_BALL_NUMBERS_SIZE) {
            uniqueNumbers.add(new Random().nextInt(9) + 1);
        }

        return uniqueNumbers.toArray(result);
    }
}


