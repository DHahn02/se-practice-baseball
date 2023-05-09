package project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static project.Position.*;

public class CommandCenterTest {
    CommandCenter commandRoom = new CommandCenter();
    @BeforeEach
    void setup(){
        commandRoom.addPlayer(new Player("Josh Thole", "JThole30", CATCHER));
        commandRoom.addPlayer(new Player("R.A. Dickey", "RDickey43", PITCHER));
        commandRoom.addPlayer(new Player("Curtis Granderson", "CGranderson03", CF));
        commandRoom.addPlayer(new Player("Daniel Murphy", "DMurphy28", SECOND));
        commandRoom.addPlayer(new Player("Michael Conforto", "MConforto30", RF));
        commandRoom.addPlayer(new Player("Brandon Nimmo", "BNimmo09", CF));
        commandRoom.addPlayer(new Player("Travis D'Arnaud", "TDarnaud07", CATCHER));
        commandRoom.addPlayer(new Player("Jon Niese", "JNiese49", PITCHER));
        commandRoom.addPlayer(new Player("Yoenis Cespedes", "YCespedes52", LF));
        commandRoom.addPlayer(new Player("Lucas Duda", "LDuda21", FIRST));
        commandRoom.addPlayer(new Player("Juan Lagares", "JLagares12", CF));
        commandRoom.addPlayer(new Player("Johan Santana", "JSantana57", PITCHER));
        commandRoom.addPlayer(new Player("Noah Syndergaard", "NSyndergaard34", PITCHER));
        commandRoom.addPlayer(new Player("Matt Harvey", "MHarvey33", PITCHER));
        commandRoom.addPlayer(new Player("David Peterson", "DPeterson23", PITCHER));
        commandRoom.addPlayer(new Player("Angel Pagan", "APagan16", LF));
        commandRoom.addPlayer(new Player("Jeff Francoeur", "JFrancoeur12", RF));
        commandRoom.addPlayer(new Player("Wilmer Flores", "WFlores04", THIRD));
        commandRoom.addPlayer(new Player("Carlos Beltran", "CBeltran15", CF));
        commandRoom.addPlayer(new Player("Ike Davis", "IDavis29", FIRST));
        

    }

    @Test
    public void addPlayer(){
        Player dw = new Player("David Wright", "DWright05", THIRD);
        commandRoom.addPlayer(dw);
        assertTrue(commandRoom.getPlayers().contains(dw));
    }

    @Test
    public void getPlayerToDemote(){
        Player p = new Player("Jose Reyes", "JReyes07", SS);

    }
}
