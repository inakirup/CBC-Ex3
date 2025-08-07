package ex3;

public class ScoreEvent {
    private String score;

    public ScoreEvent(String score) {
        this.score = score;
    }

    public String getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "ScoreEvent{" +
                "score='" + score + '\'' +
                '}';
    }
}
