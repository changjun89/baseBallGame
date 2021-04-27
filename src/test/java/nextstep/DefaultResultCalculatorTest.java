package nextstep;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefaultResultCalculatorTest {

    private ResultCalculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new DefaultResultCalculator();
    }

    @DisplayName("정상적으로 strike , ball 수를 반환한다.")
    @ParameterizedTest
    @MethodSource("provideCalculateTestArg")
    void test_return_valid_calculate_cnt(Integer[] computerNumbers, Integer[] userNumbers, Result expectedResult) {
        Result result = calculator.calculate(computerNumbers, userNumbers);
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> provideCalculateTestArg() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 3}, new Result(3, 0)),
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 4}, new Result(2, 0)),
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 3, 5}, new Result(1, 1)),
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 3, 2}, new Result(1, 2)),
                Arguments.of(new int[]{1, 2, 3}, new int[]{4, 5, 6}, new Result(0, 0))
        );
    }

}