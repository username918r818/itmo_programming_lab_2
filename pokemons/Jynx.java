package pokemons;
import moves.*;

public class Jynx extends Smoochum {
    public Jynx() {
        this("pokename", 30);
    }
    public Jynx(String name, int level) {
        super(name, level);
        setStats(65, 50, 35, 115, 95, 95);
        addMove(new LovelyKiss());
    }
    
}
