package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static project.Position.THIRD;

public class CommandCenterTest {
    CommandCenter commandRoom = new CommandCenter();

    @Test
    public void addPlayer(){
        Player dw = new Player("David Wright", "DWright05", THIRD);
        commandRoom.addPlayer(dw);
        assertTrue(commandRoom.getPlayers().contains(dw));
    }
}
