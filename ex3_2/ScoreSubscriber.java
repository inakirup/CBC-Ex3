package ex3.ex3_2;

public class ScoreSubscriber implements java.beans.PropertyChangeListener {
    private String subscriberName;
    private static int subscriberCount = 0;

    public ScoreSubscriber() {
        subscriberCount++;
        this.subscriberName = "Subscriber " + subscriberCount;
    }

    public ScoreSubscriber(String name) {
        this.subscriberName = name;
    }

    @Override
    public void propertyChange(java.beans.PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals(LiveScoreBean.SCORE_LINE_PROPERTY)) {
            String newScore = (String) evt.getNewValue();
            System.out.println("Live result: " + newScore);
        }
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    @Override
    public String toString() {
        return "ScoreSubscriber{" +
                "subscriberName='" + subscriberName + '\'' +
                '}';
    }

}
