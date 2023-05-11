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
        AtBat ab = new AtBat(p, r, this.activePitcher, this.inning);
        this.activeGame.addAtBatToGame(ab);
        p.addAtBat(ab);
    }

    public void nextInning(){
        this.inning++;
    }


    public Collection<Player> getPlayers(){
        return Collections.unmodifiableCollection(this.players.values());
    }

    public void addPlayer(Player p){
        this.players.put(p.getId(), p);
        this.lineup.add(p);
        this.demotions.add(p);
    }

    public void addGame(Game g){
        this.games.add(g);
    }

    public void startGame(boolean dh, AtBat.Pitcher p){
        endGame();
        this.activeGame = new Game(getDateInt(dh));
        this.activePitcher = p;
        this.inning = 1;
    }

    public void endGame(){
        if(this.activeGame != null) {
            this.games.add(this.activeGame);
        }
        this.activeGame = null;
        this.activePitcher = null;
    }

    public List<Player> getLineup(){
        Stack<Player> extra = new Stack<>();
        Stack<Player> lineup = new Stack<>();
        while(!hasAllPositions(lineup)){
            Player player = this.lineup.remove();
            if(!hasPosition(lineup, player)){
                lineup.add(player);
            }else{
                extra.push(player);
            }
        }
        for(Position pos : Position.values()){

        }
    }

    private boolean hasAllPositions(Stack<Player> ps){
        Stack<Player> temp = new Stack<>();
        while(ps.size() > 0){

        }
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
