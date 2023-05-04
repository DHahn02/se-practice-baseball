package project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;

public class Player implements Comparable<Player> {
    //each player has a Name, ID, Overall batting stats, Game batting stats.
    private String name;
    private String id;
    //player ID

    private double[] stats;
    private List<Game> games;
    private Set<AtBat> atBats;
    private Set<Position> positions;

    public Player(String name, String id, Position pos){
        this.name = name;
        this.id = id;
        this.stats = new double[19];
        this.games = new ArrayList<>();
        this.atBats = new HashSet<>();
        this.positions = new HashSet<>();
        this.positions.add(pos);
    }

    public void addPosition(Position p){
        this.positions.add(p);
    }

    public Set<Position> getPositions(){
        return Collections.unmodifiableSet(this.positions);
    }

    public void addGame(){
        //adds a game with its at bats, changes stats to reflect as such
    }

    public void addAtBat(){
        //adds at bad and changes relevant stats
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
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

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure {@link Integer#signum
     * signum}{@code (x.compareTo(y)) == -signum(y.compareTo(x))} for
     * all {@code x} and {@code y}.  (This implies that {@code
     * x.compareTo(y)} must throw an exception if and only if {@code
     * y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code
     * x.compareTo(y)==0} implies that {@code signum(x.compareTo(z))
     * == signum(y.compareTo(z))}, for all {@code z}.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     * @apiNote It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     */
    @Override
    public int compareTo(Player o) {
        return 0;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj == this) return true;
        if(obj instanceof Player o){
            return o.id.equals(this.id);
        }
        return false;
    }
}
