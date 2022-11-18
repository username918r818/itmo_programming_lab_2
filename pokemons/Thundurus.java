package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;;

public class Thundurus extends Pokemon {
    public Thundurus() {
        super("pokename", 1);
    }
    public Thundurus(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setType(Type.FLYING);
        setStats(79, 115, 70, 125, 80, 111);
        setMove(new BrutalSwing(), new Discharge(), new Agility());
    }
    
}
