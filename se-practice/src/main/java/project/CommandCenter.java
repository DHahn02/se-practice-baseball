package project;
import java.time.LocalDateTime;
import java.util.*;

public class CommandCenter {
    PriorityQueue<Player> lineup;
    PriorityQueue<Player> demotions;
    Map<String, Player> players;
    List<Game> games;
    Game activeGame;
    int inning;
    AtBat.Pitcher activePitcher;
    //uli has necrophilia
    public CommandCenter(){
        this.lineup = new PriorityQueue<>(Comparator.reverseOrder());
        this.demotions = new PriorityQueue<>();
        this.players = new HashMap<>();
        this.games = new ArrayList<>();
        this.activeGame = null;
        this.inning = 1;
        this.activePitcher = null;
    }

    public void addAtBat(Player p, Result r){
        this.activeGame.addAtBatToGame(new AtBat(p, r, this.activePitcher, this.inning));
    }

    public void nextInning(){
        this.inning++;
    }


    public Collection<Player> getPlayers(){
        return Collections.unmodifiableCollection(this.players.values());
    }

    public void addPlayer(Player p){
        this.players.put(p.getId(), p);
    }

    public void addGame(Game g){
        this.games.add(g);
    }

    public void startGame(Game g, AtBat.Pitcher p){
        this.activeGame = g;
        this.activePitcher = p;
        this.inning = 1;
    }

    public void endGame(){
        this.activeGame = null;
        this.activePitcher = null;
        this.games.add(this.activeGame);
    }

    public List<Player> getLineup(){
        return Collections.emptyList();
    }

    public Player getPlayerToDemote(){
        Player p = this.demotions.remove();
        this.demotions.add(p);
        return p;
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
