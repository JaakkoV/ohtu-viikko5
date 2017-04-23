package ohtu;

public class TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;
    private Player first;
    private Player second;

    public TennisGame(String player1Name, String player2Name) {
        this.first = new Player(player1Name);
        this.second = new Player(player2Name);
    }

    public void wonPoint(String playerName) {
        if (playerName == first.getName()) {
            first.increasePoints();
        } else {
            second.increasePoints();
        }
    }

    public String getScore() {
        return ScoreMonitor.printScore(first, second);
    }
}
