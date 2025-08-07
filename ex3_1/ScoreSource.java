package ex3;

import java.util.List;
import java.util.ArrayList;

public class ScoreSource {
    private List<ScoreListener> listeners = new ArrayList<>();
    private String currentScore = "";

    public void addScoreListener(ScoreListener listener) {
        listeners.add(listener);
        System.out.println("Listener added: " + listener);
    }

    public void removeScoreListener(ScoreListener listener) {
        listeners.remove(listener);
        System.out.println("Listener removed: " + listener);
    }

    public void setScore(String score) {
        this.currentScore = score;
        ScoreEvent event = new ScoreEvent(score);

        for (ScoreListener listener : listeners) {
            listener.scoreChanged(event);
        }
    }

    public String getCurrentScore() {
        return currentScore;
    }

    public int getListenerCount() {
        return listeners.size();
    }
}
