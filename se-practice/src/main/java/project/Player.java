package project;

public class Player {
    //each player has a Name, ID, Overall batting stats, Game batting stats.
    private String name;
    private int id;
    //player ID

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

    public double getS(){
        return this.stats[4];
    }

    public void setS(int s){
        this.stats[4] = s;
    }

    public double getD() {
        return this.stats[5];
    }

    public void setD(int d) {
        this.stats[5] = d;
    }

    public double getT() {
        return this.stats[6];
    }

    public void setT(int t) {
        this.stats[6] = t;
    }

    public double getHR() {
        return this.stats[7];
    }

    public void setHR(int HR) {
        this.stats[7] = HR;
    }

    public double getRBI() {
        return this.stats[8];
    }

    public void setRBI(int RBI) {
        this.stats[8] = RBI;
    }

    public double getTB() {
        return this.stats[9];
    }

    public void setTB(int TB) {
        this.stats[9] = TB;
    }

    public double getBB() {
        return this.stats[10];
    }

    public void setBB(int BB) {
        this.stats[10] = BB;
    }

    public double getHBP() {
        return this.stats[11];
    }

    public void setHBP(int HBP) {
        this.stats[11] = HBP;
    }

    public double getK() {
        return this.stats[12];
    }

    public void setK(int k) {
        this.stats[12] = k;
    }

    public double getSB() {
        return this.stats[13];
    }

    public void setSB(int SB) {
        this.stats[13] = SB;
    }

    public double getAVG() {
        return this.stats[14];
    }

    public void setAVG(double AVG) {
        this.stats[14] = AVG;
    }

    public double getOBP() {
        return this.stats[15];
    }

    public void setOBP(double OBP) {
        this.stats[15] = OBP;
    }

    public double getSLG() {
        return this.stats[16];
    }

    public void setSLG(double SLG) {
        this.stats[16] = SLG;
    }

    public double getOPS() {
        return this.stats[17];
    }

    public void setOPS(double OPS) {
        this.stats[17] = OPS;
    }

    public double getWAR() {
        return this.stats[18];
    }

    public void setWAR(double WAR) {
        this.stats[18] = WAR;
    }
}
