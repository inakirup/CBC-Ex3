package ex3;

import java.util.Scanner;

public class FootballScoreEventApp {
    public static void main(String[] args) {
        ScoreSource scoreSource = new ScoreSource();

        // Create subscribers
        ScoreSubscriber subscriber1 = new ScoreSubscriber("Alice");
        ScoreSubscriber subscriber2 = new ScoreSubscriber("Bob");

        // Add subscribers to the score source
        scoreSource.addScoreListener(subscriber1);
        scoreSource.addScoreListener(subscriber2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter score: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println("Exiting...");
                break;
            }

            // Set the new score
            scoreSource.setScore(input);
            System.out.println("Score updated to: " + input);
        }

        System.out.println("Last score: " + scoreSource.getCurrentScore());
        System.out.println("Total subscribers: " + scoreSource.getListenerCount());
    }
}
