package nextstep;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RandomComputerNumberGeneratorTest {

    @Test
    @DisplayName("랜덤으로 생성된 숫자의 배열의 길이는 BASE_BALL_NUMBERS_SIZE 와 같아야 한다.")
    void test_should_generated_numbers_length_same_with_BASE_BALL_NUMBERS_SIZE() {
        Integer[] generatedNumbers = new RandomComputerNumberGenerator().generate();

        assertEquals(BaseBallGameConst.BASE_BALL_NUMBERS_SIZE, generatedNumbers.length);
    }

    @Test
    @DisplayName("랜덤으로 생성된 숫자에는 중복된 값이 없어야 한다.")
    void test_should_generated_numbers_not_duplicated() {
        Integer[] generatedNumbers = new RandomComputerNumberGenerator().generate();

        Set<Integer> setNumbers = new HashSet<>();
        for (int generatedNumber : generatedNumbers) {
            setNumbers.add(generatedNumber);
        }

        assertEquals(generatedNumbers.length, setNumbers.size());
    }

    @Test
    @DisplayName("랜덤으로 생성된 숫자는 1~ 9 사이어야 한다..")
    public void test_should_generated_numbers_higher_than_0_and_lower_than_10(){
        Integer[] generatedNumbers = new RandomComputerNumberGenerator().generate();
        for (int generatedNumber : generatedNumbers) {
            assertEquals( (generatedNumber > 0 && generatedNumber < 10), true );
        }
    }
}