package moves;

import ru.ifmo.se.pokemon.*;

public class Discharge extends SpecialMove {
    public Discharge() {
        super(Type.ELECTRIC, 80, 100);
    }
    protected void applyOppEffects(Pokemon p) {
        Effect.paralyze(p);
    }
    protected String describe() {
        return "рязряжает";
    }
}
