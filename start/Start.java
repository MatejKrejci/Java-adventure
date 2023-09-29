package start;
import game.Game;
import ui.TextUI;
/**
 * Spouštěcí třída aplikace.
 *
 * @author Matěj Krejčí
 * @author Jan Říha
 * @version LS-2023, 2023-25-06
 */
public class Start {
    
    /**
     * Spouštěcí metoda aplikace.
     *
     * @param args parametry aplikace z příkazové řádky <i>(aktuálně se ignorují)</i>
     */
    public static void main(String[] args) {
        System.out.print("\n> ");
        Game game = new Game();
        TextUI ui = new TextUI(game);

        ui.play();
    }
}
