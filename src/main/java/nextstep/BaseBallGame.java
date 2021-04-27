package nextstep;

public class BaseBallGame {

    private Integer[] computerNumbers;
    private ResultCalculator resultCalculator;

    public BaseBallGame(ComputerNumbersGenerator computerNumbersGenerator, ResultCalculator resultCalculator) {
        computerNumbers = computerNumbersGenerator.generate();
        this.resultCalculator = resultCalculator;
    }

    public Result play(Integer[] userNumbers) {
        return resultCalculator.calculate(computerNumbers, userNumbers);
    }
}
