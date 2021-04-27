package nextstep;

import java.util.Objects;

public class Result {
    private int strikeCount;
    private int ballCount;

    public Result(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public boolean isEnded() {
        return strikeCount == 3;
    }

    @Override
    public String toString() {
        return "Result{" +
                "strikeCount=" + strikeCount +
                ", ballCount=" + ballCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return strikeCount == result.strikeCount && ballCount == result.ballCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strikeCount, ballCount);
    }
}
