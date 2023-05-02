package project;

public class AtBat {
    private Result result;
    public enum Pitcher{
        RHP, LHP
    };
    private Pitcher pitcher;
    private int inning;

    public AtBat(Result r, Pitcher p, int inning){
        this.result = r;
        this.pitcher = p;
        this.inning = inning;
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
}
