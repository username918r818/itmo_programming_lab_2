package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Smoochum extends Pokemon{
    public Smoochum() {
        this("pokename", 1);
    }
    public Smoochum(String name, int level) {
        super(name, level);
        setType(Type.ICE);
        setType(Type.PSYCHIC);
        setStats(45, 30, 15, 85, 65, 65);
        setMove(new Psychic(), new Lick(), new HeartStamp());
    }
}
