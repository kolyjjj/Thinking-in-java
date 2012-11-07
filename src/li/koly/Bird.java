package li.koly;

public class Bird implements Noise, Roar{
    @Override
    public String makeNoise() {
        return "A bird is making noise!";
    }

    @Override
    public String toString() {
        return "Bird";
    }

    @Override
    public String makeRoar() {
        return "A Bird is roaring!";
    }
}
