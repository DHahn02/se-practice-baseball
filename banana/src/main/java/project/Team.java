package project;

import java.util.HashSet;
import java.util.Set;

public class Team {
    private String name;
    private Set<Player> players;

    public Team(String name){
        this.name = name;
        this.players = new HashSet<>();
    }

    public Team(String name, Set<Player> players){
        this.name = name;
        this.players = players;
    }
}
