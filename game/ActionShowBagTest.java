package game;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActionShowBagTest {
    private Backpack backpack;
    private ActionShowBag action;
    String[] parameters = {};

    @Before
    public void setUp() {
        backpack = new Backpack(5);
        action = new ActionShowBag(backpack);
    }

    @Test
    public void testExecuteEmptyBag() {
        String expected = "Tvůj batoh je prázdný";
        String result = action.execute(parameters);
        assertEquals(expected, result);
    }

    @Test
    public void testExecuteWithItems() {
        String expected = "V batohu máš: \n- Klíč\n- Mapa\n- Nůž\n";
        backpack.addItem(new Item("Klíč", "klic"));
        backpack.addItem(new Item("Mapa", "mapa"));
        backpack.addItem(new Item("Nůž", "nuz"));
        String result = action.execute(parameters);
        assertEquals(expected, result);
    }

    @Test
    public void testExecuteWithFullBag() {
        String expected = "V batohu máš: \n- Klíč\n- Mapa\n- Nůž\n- Brýle\n- Rukavice\n";
        backpack.addItem(new Item("Klíč", "klic"));
        backpack.addItem(new Item("Mapa", "mapa"));
        backpack.addItem(new Item("Nůž", "nuz"));
        backpack.addItem(new Item("Brýle", "bryle"));
        backpack.addItem(new Item("Rukavice", "rukavice"));
        String result = action.execute(parameters);
        assertEquals(expected, result);
    }

    @Test
    public void testExecuteWithInvalidParameters() {
        String expected = "Nevím, který inventář chceš ukázat, mám pouze jeden batoh.";
        String[] invalidParameters = {"batoh1", "batoh2"};
        String result = action.execute(invalidParameters);
        assertEquals(expected, result);
    }
}
