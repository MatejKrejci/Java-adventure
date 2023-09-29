package game;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActionLocationInfoTest {
    private Game game;
    private ActionLocationInfo action;

    @Before
    public void setUp() {
        game = new Game();
        action = new ActionLocationInfo(game);
    }

    @Test
    public void testExecute() {
        String expected = "-Tohle je moje cela. Smrdí to tu chcankama a tvoji spoluvězni jsou šmejdi.\n" + "----------------------------------------------------------------------\n"
            + "Exits: Chodba";
        String result = action.execute(new String[0]);
        assertEquals(expected, result);
    }
}
