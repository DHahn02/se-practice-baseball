package project;

public class Player {
    //each player has a Name, ID, Overall batting stats, Game batting stats.
    private String name;
    private int id;
    //player ID
    private double GP;
    //Games Played
    private int AB;
    //At Bats
    private int R;
    //Runs
    private int H;
    //Hits
    private int S;
    //singles
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

    private double[] stats;

    public Player(String name, int id){
        this.name = name;
        this.id = id;
        this.stats = new double[19];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGP() {
        return stats[0];
    }

    public void setGP(double GP) {
        this.stats[0] = GP;
    }

    public double getAB() {
        return stats[1];
    }

    public void setAB(int AB) {
        this.stats[1] = AB;
    }

    public double getR() {
        return this.stats[2];
    }

    public void setR(int r) {
        this.stats[2] = r;
    }

    public double getH() {
        return this.stats[3];
    }

    public void setH(int h) {
        this.stats[3] = h;
    }

    public double getSingles(){

    }

    public void setSingles(){

    }

    public double getD() {
        return this.stats[4];
    }

    public void setD(int d) {
        this.stats[4] = d;
    }

    public double getT() {
        return this.stats[5];
    }

    public void setT(int t) {
        this.stats[5] = t;
    }

    public double getHR() {
        return this.stats[6];
    }

    public void setHR(int HR) {
        this.stats[6] = HR;
    }

    public double getRBI() {
        return this.stats[7];
    }

    public void setRBI(int RBI) {
        this.stats[7] = RBI;
    }

    public double getTB() {
        return this.stats[8];
    }

    public void setTB(int TB) {
        this.stats[8] = TB;
    }

    public double getBB() {
        return this.stats[9];
    }

    public void setBB(int BB) {
        this.stats[9] = BB;
    }

    public double getHBP() {
        return this.stats[10];
    }

    public void setHBP(int HBP) {
        this.stats[10] = HBP;
    }

    public double getK() {
        return this.stats[11];
    }

    public void setK(int k) {
        this.stats[11] = k;
    }

    public double getSB() {
        return this.stats[12];
    }

    public void setSB(int SB) {
        this.stats[12] = SB;
    }

    public double getAVG() {
        return this.stats[13];
    }

    public void setAVG(long AVG) {
        this.stats[13] = AVG;
    }

    public double getOBP() {
        return this.stats[14];
    }

    public void setOBP(long OBP) {
        this.stats[14] = OBP;
    }

    public double getSLG() {
        return this.stats[15];
    }

    public void setSLG(long SLG) {
        this.stats[15] = SLG;
    }

    public double getOPS() {
        return this.stats[16];
    }

    public void setOPS(long OPS) {
        this.stats[16] = OPS;
    }

    public double getWAR() {
        return this.stats[17];
    }

    public void setWAR(long WAR) {
        this.stats[17] = WAR;
    }


}
