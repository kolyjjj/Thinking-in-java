package li.koly;

public class Dog extends Animal implements Noise, Roar {
    @Override
    public String makeNoise() {
        return "A Dog is making noise!";
    }

    @Override
    public String toString() {
        return "Dog";
    }

    @Override
    public String makeRoar() {
        return "A Dog is roaring!";
    }
}
