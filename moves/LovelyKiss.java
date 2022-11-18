package moves;

import ru.ifmo.se.pokemon.*;

public class LovelyKiss extends StatusMove{
    public LovelyKiss() {
        super(Type.NORMAL, 0, 75);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect().turns((int)(Math.random()*3 + 1));
        p.addEffect(effect);
        Effect.sleep(p);
    }
    @Override
    protected String describe() {
        return "сладко целует";
    }
}
