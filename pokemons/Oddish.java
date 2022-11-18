package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Oddish extends Pokemon {
    public Oddish() {
        this("pokename", 1);
    }
    public Oddish(String name, int level) {
        super(name, level);
        setType(Type.GRASS);
        setType(Type.POISON);
        setStats(45, 50, 55, 75, 65, 30);
        setMove(new Swagger(), new Venoshock());
    }
}
