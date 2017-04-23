package ohtu;

import java.util.HashMap;

public class ScoreMonitor {

    private static final String[] pointsToText = new String[] {"Love","Fifteen", "Thirty", "Forty"};

    public static String printScore(Player first, Player second) {
        if (first.getPoints() == second.getPoints()) {
            return (first.getPoints() < 4)
                    ? pointsToText[first.getPoints()] + "-All"
                    : "Deuce";
        } else if (first.getPoints()
                >= 4 || second.getPoints() >= 4) {
            String lead = first.getPoints() > second.getPoints() ? first.getName() : second.getName();
            return (Math.abs(first.getPoints() - second.getPoints()) > 1) ? "Win for " + lead : "Advantage " + lead;
        } else {
            return pointsToText[first.getPoints()] + "-" + pointsToText[second.getPoints()];
        }
    }

}
