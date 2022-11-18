package pokemons;
import moves.*;

public class Gloom extends Oddish {
    public Gloom() {
        this("pokename", 21);
    }
    public Gloom(String name, int level) {
        super(name, level);
        setStats(60, 65, 70, 85, 75, 40);
        addMove(new Absorb());
    }
    
}
