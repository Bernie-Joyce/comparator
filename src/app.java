import java.util.ArrayList;
import java.util.List;

final class Score implements Comparable<Score> {
    private final String player;
    private final int value;

    public Score(String player, int value) {
        this.player = player;
        this.value = value;
    }
    public String player() { return player; }
    public int value() { return value; }

    @Override
    public int compareTo(Score other) {
        // Primary: higher value first (descending)
        int byValueDesc = Integer.compare(other.value, this.value);
        if (byValueDesc != 0) return byValueDesc;
        // Tie-break: player name ascending (A->Z)
        return this.player.compareTo(other.player);
    }

    @Override
    public String toString() {
        return player + ":" + value;
    }
}

class DemoComparable {
    public static void main(String[] args) {
        var scores = new ArrayList<Score>();
        scores.add(new Score("Zara", 20));
        scores.add(new Score("Alan", 20));
        scores.add(new Score("Mia", 50));
        scores.add(new Score("Bea", 10));

        // Use natural order (compareTo)
        scores.sort(null); // or Collections.sort(scores)
        System.out.println(scores);
    }
}
