package moves;

import ru.ifmo.se.pokemon.*;

public class Lick extends PhysicalMove {
    public Lick() {
        super(Type.GHOST, 30, 100);
    }
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect().chance(0.33);
        p.addEffect(effect);
        Effect.paralyze(p);
    }
    protected String describe() {
        return "лижет";
    }

}
