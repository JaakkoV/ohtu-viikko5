package ohtu;

public class Player {

    String name;
    int points;

    public Player(String name) {
        this.name = name;
        this.points = 0;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    void increasePoints() {
        this.points++;
    }

}
