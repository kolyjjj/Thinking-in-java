package li.koly;

public class GenericRoar<T, A> extends GenericNoise {

    private A t;

    public GenericRoar(T t, A a) {
        super(t);
        this.t = a;
    }

    @Override
    public String roar() {
        return ((Roar)a).makeRoar() + "\n" + ((Roar)t).makeRoar();
    }

    @Override
    public String toString() {
        return a.toString() + " and " + t.toString();
    }
}
