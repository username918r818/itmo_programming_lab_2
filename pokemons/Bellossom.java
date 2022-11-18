package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.Type;

public class Bellossom extends Gloom {
    public Bellossom() {
        this("pokename", 21);
    }
    public Bellossom(String name, int level) {
        super(name, level);
        setType(Type.GRASS);
        setStats(75, 80, 95, 90, 100, 50);
        addMove(new Swagger());
    }
    
}
