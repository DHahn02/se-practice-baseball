package project;

import java.util.*;

public class Game {
    private List<AtBat> atBatList = new ArrayList<>();
    private String id;

    public Game(String id){
        this.id = id;
        this.atBatList = new ArrayList<>();
    }

    public Game(String id, AtBat ab){
        this.id = id;
        this.atBatList = new ArrayList<>();
        this.atBatList.add(ab);
    }

    public Game(String id, List<AtBat> abs){
        this.id = id;
        this.atBatList = abs;
    }

    public String getID(){
        return this.id;
    }

    public void addAtBatToGame(AtBat ab) {
        this.atBatList.add(ab);
    }

    public void addAtBats(List<AtBat> abs){
        this.atBatList.addAll(abs);
    }

    public List<AtBat> getAtBats(){
        return Collections.unmodifiableList(this.atBatList);
    }

    public boolean equals(Object o){
        if(o == null) return false;
        if(o == this) return true;
        if(o instanceof Game obj){
            return obj.id.equals(this.id);
        }
        return false;
    }
}