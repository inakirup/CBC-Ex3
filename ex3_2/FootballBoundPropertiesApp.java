package ex3.ex3_2;

import java.util.Scanner;


public class FootballBoundPropertiesApp {
    public static void main(String[] args) {
        LiveScoreBean liveScoreBean = new LiveScoreBean();

        // Create subscribers
        ScoreSubscriber subscriber1 = new ScoreSubscriber("Alice");
        ScoreSubscriber subscriber2 = new ScoreSubscriber("Bob");

        // Add subscribers to the live score bean
        liveScoreBean.addPropertyChangeListener(LiveScoreBean.SCORE_LINE_PROPERTY, subscriber1);
        liveScoreBean.addPropertyChangeListener(LiveScoreBean.SCORE_LINE_PROPERTY, subscriber2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter score: ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Exiting...");
                break;
            }

            // Set the new score
            liveScoreBean.setScoreLine(input);
            System.out.println("Score updated to: " + input);
        }

        System.out.println("Last score: " + liveScoreBean.getScoreLine());
        System.out.println("Total subscribers: " + liveScoreBean.getPropertyChangeListeners().length);
    }
}
