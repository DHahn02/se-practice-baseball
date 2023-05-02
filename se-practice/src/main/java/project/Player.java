package project;

public class Player {
    //each player has a Name, ID, Overall batting stats, Game batting stats.
    private String name;
    private int ID;
    //player ID
    private int GP;
    //Games Played
    private int AB;
    //At Bats
    private int R;
    //Runs
    private int H;
    //Hits
    private int D;
    //Doubles
    private int T;
    //Triples
    private int HR;
    //Home Runs
    private int RBI;
    //Runs Batted In
    private int TB;
    //Total Bases
    private int BB;
    //Walks
    private int HBP;
    //Hit By Pitch
    private int K;
    //Strikeouts
    private int SB;
    //Stolen Bases
    private long AVG;
    //Batting Average
    private long OBP;
    //On Base Percentage
    private long SLG;
    //Slugging Percentage
    private long OPS;
    //On Base plus Slugging
    private long WAR;
    //Wins Above Replacement
    private int[] stats;
    public Player(String name, int ID, int[] stats ){
        this.name = name;
        this.ID = ID;
        this.stats = new int[18];
    }
    public int[] enterResult(){




        return null;
    }
}
