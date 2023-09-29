package game;
/** Třída představuje postavy ve scenáři hry. Každá postava má
 * název, který ji jednoznačně identifikuje. Každá postava má svůj vlastní
 * a jedinečný popis a dialog. Dále také u postavy určujeme, jestli mluví.
 * 
 * @author Jan Říha
 * @author Matěj Krejčí
 * @version LS-2023, 2023-25-06
 */
public class Npc implements Comparable <Npc>{
    private String name;
    private String description;
    private boolean talks;
    private String dialog;
    private String dialogTwo;
    private String dialogThree;
    private int dialogCount = 1;

    /**
     * Konstruktor třídy, vytvoří postavu se zadaným názvem, popisem, dialogem a boolean hodnotou zda postava mluví.
     * 
     * @param name jméno postavy
     * @param description popisek postavy
     * @param talks mluví postava
     * @param dialog co řekne postava po použití příkazu mluv
     */
    public Npc (String name, String description, boolean talks, String dialog,String dialogTwo,String dialogThree ) {
        this.name = name;
        this.description = description;
        this.talks = talks;
        this.dialog = dialog;
        this.dialogTwo = dialogTwo;
        this.dialogThree = dialogThree;
    }

    /**
     * Konstruktor třídy, vytvoří postavu se zadaným názvem, popisem, dialogem.
     * 
     * @param name jméno postavy
     * @param description popisek postavy
     */
    public Npc (String name, String description) {
        this.name = name;
        this.description = description;
        this.talks = false;
    }

    /**
     * Metoda vrací jméno postavy
     * 
     * @return name jméno postavy
     */
    public String getName() {
        return name;
    }

    /**
     * Metoda vrací popisek postavy
     * 
     * @return description popis postavy
     */
    public String getDescription() {
        return description;
    }

    /**
     * Metoda vrací dialog postavy
     * 
     * @return dialog proslov postavy
     */
    public String getDialog() {
        return dialog;
    }

    /**
     * Metoda zkontroluje, zda postava mluví nebo ne
     * 
     * return talks mluví {@code true} pokud postava mluví; {@code false} postava nemluví, nemá nastavený ani dialog
     */
    public boolean talks() {
        return talks;
    }
        /**
     * Metoda porovnává dvě lokace <i>(objekty)</i>. Lokace jsou shodné,
     * pokud mají stejný název <i>(atribut {@link #nazev})</i>. Tato metoda
     * je důležitá pro správné fungování množiny východů do sousedních
     * lokací.
     * <p>
     * Podrobnější popis metody najdete v dokumentaci třídy {@linkplain Object}.
     *
     * @param o objekt, který bude porovnán s aktuálním
     * @return {@code true}, pokud mají obě lokace stejný název; jinak {@code false}
     *
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(final Object o)
    {
        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o instanceof Npc) {
            Npc npc = (Npc) o;

            return name.equals(npc.getName());
        }

        return false;
    }
    
    @Override
    public int compareTo(Npc npc)
    {
        return name.compareTo(npc.getName());
    }
}
