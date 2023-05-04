package project;
import java.time.LocalDateTime;
import java.util.*;

public class CommandCenter {
    PriorityQueue<Player> lineup;
    PriorityQueue<Player> demotions;
    Map<String, Player> players;

    public CommandCenter(){
        this.lineup = new PriorityQueue<>(Comparator.reverseOrder());
        this.demotions = new PriorityQueue<>();
        this.players = new HashMap<>();
    }

    public void addAtBat(Player p, AtBat a, Game g){

    }

    public List<Player> getLineup(){
        /**OLD MCDONALD HAD A FARM EAYY EAYYYYYY OHHHHHH**/
    }


    private String getDateInt(){
        LocalDateTime now = LocalDateTime.now();
        String year = String.valueOf(now.getYear());
        String month = String.valueOf(now.getMonthValue());
        String day = String.valueOf(now.getDayOfMonth());
        return year+month+day;
    }


}
