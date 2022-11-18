package moves;

import ru.ifmo.se.pokemon.*;

public class Lick extends PhysicalMove {
    public Lick() {
        super(Type.GHOST, 30, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect().chance(0.33);
        p.addEffect(effect);
        Effect.paralyze(p);
    }
    @Override
    protected String describe() {
        return "лижет";
    }

}
