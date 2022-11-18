package moves;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove{
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect().turns((int)(Math.random()*4 + 1)).stat(Stat.ATTACK, 2);
        p.addEffect(effect);
        Effect.confuse(p);
    }

    protected String describe() {
        return "SWAG";
    }
}
