package project;
import java.time.LocalDateTime;
import java.util.*;

public class CommandCenter {
    PriorityQueue<Player> lineup;
    PriorityQueue<Player> demotions;
    Map<String, Player> players;
    //uli has necrophilia
    public CommandCenter(){
        this.lineup = new PriorityQueue<>(Comparator.reverseOrder());
        this.demotions = new PriorityQueue<>();
        this.players = new HashMap<>();
    }

    public void addAtBat(Player p, AtBat a, Game g){
        return;
    }

    public List<Player> getLineup(){
<<<<<<< HEAD
        return Collections.emptyList();
=======
        /**OLD MCDONALD HAD A FARM EAYY EAYYYYYY OHHHHHH**/
>>>>>>> a677657da9d873d6ad583b39f397278913474534
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
