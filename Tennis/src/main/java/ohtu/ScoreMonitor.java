package ohtu;

public class ScoreMonitor {

    private static final String[] pointsToText = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

    public static String printScore(Player first, Player second) {
        if (first.getPoints() == second.getPoints()) {
            return printDeuce(first);
        } else if (first.getPoints()
                >= 4 || second.getPoints() >= 4) {
            return printOverFour(first, second);
        } else {
            return pointsToText[first.getPoints()] + "-" + pointsToText[second.getPoints()];
        }
    }

    private static String printOverFour(Player first, Player second) {
        String lead = first.getPoints() > second.getPoints() ? first.getName() : second.getName();
        return (Math.abs(first.getPoints() - second.getPoints()) > 1) ? "Win for " + lead : "Advantage " + lead;
    }

    private static String printDeuce(Player first) {
        return (first.getPoints() < 4)
                ? pointsToText[first.getPoints()] + "-All"
                : "Deuce";
    }

}
