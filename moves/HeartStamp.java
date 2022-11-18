package moves;
import ru.ifmo.se.pokemon.*;

public class HeartStamp extends PhysicalMove{
    public HeartStamp() {
        super(Type.PSYCHIC, 60, 100);
    }

    @Override
    protected String describe() {
        return "на сердце колдует";
    }
}
