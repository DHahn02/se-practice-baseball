package project;

public class AtBat {
    Result result;
    public enum Pitcher{
        RHP, LHP
    };
    Pitcher pitcher;

    public AtBat(Result r, Pitcher p){
        this.result = r;
        this.pitcher = p;
    }
}
