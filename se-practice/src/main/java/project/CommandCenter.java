package project;
import java.time.LocalDateTime;

public class CommandCenter {

    public void addAtBat(Player p, AtBat a, Game g){

    }


    private String getDateInt(){
        LocalDateTime now = LocalDateTime.now();
        String year = String.valueOf(now.getYear());
        String month = String.valueOf(now.getMonthValue());
        String day = String.valueOf(now.getDayOfMonth());
        return year+month+day;
    }


}
