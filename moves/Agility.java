package moves;

import ru.ifmo.se.pokemon.*;

public class Agility extends StatusMove {
    public Agility() {
        super(Type.PSYCHIC, 0, 0);
    }
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, 2);
    }

    protected String describe() {
        return "ловчит";
    }
}
