package nextstep;

import nextstep.view.InputView;
import nextstep.view.OutputView;

public class BaseBallGameStarter {
    private static final String GAME_END_FLAG = "2";

    public static void main(String[] args) {
        play();
    }

    private static void play() {
        while (true) {
            BaseBallGame game = launch();
            startGame(game);
            String gameOrEnd = InputView.askNewGameOrEnd();
            if (gameOrEnd.equals(GAME_END_FLAG)) {
                break;
            }
        }
    }

    private static void startGame(BaseBallGame game) {
        while (true) {
            Integer[] userNumbers = InputView.askNumbers();
            Result result = game.play(userNumbers);
            OutputView.printResult(result);

            if (result.isEnded()) {
                break;
            }
        }
    }

    private static BaseBallGame launch() {
        return new BaseBallGame(
                new RandomComputerNumberGenerator(),
                new DefaultResultCalculator()
        );
    }
}
