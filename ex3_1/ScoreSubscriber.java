package ex3;

public class ScoreSubscriber implements ScoreListener {
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
    public void scoreChanged(ScoreEvent event) {
        System.out.println("Live result: " + event.getScore());
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
