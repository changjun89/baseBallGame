package nextstep;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BaseBallGameTest {

    @Test
    @DisplayName("유저의 숫자에 맞는 정확한 결과를 리턴한다")
    void test_return_valid_result_and_is_ended() {
        //given
        DefaultResultCalculator calculator = new DefaultResultCalculator();
        BaseBallGame baseBallGame = new BaseBallGame(
                () -> new Integer[]{1, 2, 3},
                calculator
        );

        //when
        Result result = baseBallGame.play(new Integer[]{1, 2, 3});

        //then
        assertEquals(3, result.getStrikeCount());
        assertEquals(0, result.getBallCount());
        assertEquals(true, result.isEnded());
    }

}