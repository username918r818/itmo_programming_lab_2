package moves;

import ru.ifmo.se.pokemon.*;

public class BrutalSwing extends PhysicalMove{
    public BrutalSwing() {
        super(Type.DARK, 60d, 100d);
    }
    @Override
    protected String describe() {
        return "брутально качелит";
    }
}
