import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class lab2 {
    public static void main(String[] args) {
        Thundurus u = new Thundurus("U", 1);
        Smoochum s = new Smoochum("S", 1);
        Jynx a = new Jynx("A", 30);
        Oddish z = new Oddish("Z", 1);
        Gloom o = new Gloom("O", 21);
        Bellossom v = new Bellossom("V", 21);


        System.out.println();
        Battle b = new Battle();
        b.addAlly(z);
        b.addAlly(o);
        b.addAlly(v);
        b.addFoe(u);
        b.addFoe(s);
        b.addFoe(a);
        b.go();
    }
}