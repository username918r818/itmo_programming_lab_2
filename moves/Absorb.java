package moves;

import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove {
    public Absorb() {
        super(Type.GRASS, 20, 100);
    } 
    
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int) (- Math.round(damage) / 2)); 
    }

    protected String describe() {
        return "абсорибрует";
    }

}
