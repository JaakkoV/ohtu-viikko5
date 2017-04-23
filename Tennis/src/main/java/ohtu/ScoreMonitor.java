package ohtu;

import java.util.HashMap;

public class ScoreMonitor {

    private static final HashMap<Integer, String> pointsToText = createPointsToText();

    private static HashMap<Integer, String> createPointsToText() {
        HashMap<Integer, String> pointsText = new HashMap<>();
        pointsText.put(0, "Love");
        pointsText.put(1, "Fifteen");
        pointsText.put(2, "Thirty");
        pointsText.put(3, "Forty");
        return pointsText;
    }

    public static String printScore(Player first, Player second) {
        if (first.getPoints() == second.getPoints()) {
            return (first.getPoints() < 4)
                    ? pointsToText.get(first.getPoints()) + "-All"
                    : "Deuce";
        } else if (first.getPoints()
                >= 4 || second.getPoints() >= 4) {
            String lead = first.getPoints() > second.getPoints() ? first.getName() : second.getName();
            return (Math.abs(first.getPoints() - second.getPoints()) > 1) ? "Win for " + lead : "Advantage " + lead;
        } else {
            return pointsToText.get(first.getPoints()) + "-" + pointsToText.get(second.getPoints());
        }
    }

}
