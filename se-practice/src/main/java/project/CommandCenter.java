package project;
import java.time.LocalDateTime;
import java.util.*;

public class CommandCenter {
    PriorityQueue<Player> lineup;
    PriorityQueue<Player> demotions;
    Map<String, Player> players;
    List<Game> games;
    //uli has necrophilia
    public CommandCenter(){
        this.lineup = new PriorityQueue<>(Comparator.reverseOrder());
        this.demotions = new PriorityQueue<>();
        this.players = new HashMap<>();
        this.games = new ArrayList<>();
    }

    public void addAtBat(Player p, AtBat a, Game g){
        return;
    }

    public void addGame(Game g){
        this.games.add(g);
    }

    public List<Player> getLineup(){
        return Collections.emptyList();
    }

    public Player getPlayerToDemote(){
        return null;
    }

    private String getDateInt(boolean dh){
        LocalDateTime now = LocalDateTime.now();
        String year = String.valueOf(now.getYear());
        String month = String.valueOf(now.getMonthValue());
        String day = String.valueOf(now.getDayOfMonth());
        if(dh){
            return year+month+day+1;
        }
        return year+month+day;
    }


}
