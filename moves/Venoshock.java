package moves;
import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove {
    public Venoshock() {
        super(Type.POISON, 65, 100);
    }    
    protected void applyOppDamage(Pokemon def, double damage) {
        if (def.getCondition().equals(Status.POISON)) {
            def.setMod(Stat.HP, 2 * (int) Math.round(damage)); 
        } else {
            def.setMod(Stat.HP, (int) Math.round(damage)); 
        }
    }
    protected String describe() {
        return "веношокирует";
    }
}
