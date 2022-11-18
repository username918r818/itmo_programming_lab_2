package moves;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove{
    public Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(effect);
    }
    protected String describe() {
        return "психует";
    }
}
