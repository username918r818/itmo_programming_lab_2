package moves;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove{
    public Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(effect);
    }
    @Override
    protected String describe() {
        return "психует";
    }
}
