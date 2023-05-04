package project;

public class AtBat {
    private Result result;
    public enum Pitcher{
        RHP, LHP
    };
    private Pitcher pitcher;
    private Player batter;
    private int inning;

    public AtBat(Player b, Result r, Pitcher p, int inning){
        this.result = r;
        this.pitcher = p;
        this.inning = inning;
        this.batter = b;
    }

    public Result getResult() {
        return result;
    }

    public Pitcher getPitcher() {
        return pitcher;
    }

    public int getInning() {
        return inning;
    }

    public Player getBatter(){
        return this.batter;
    }
}
