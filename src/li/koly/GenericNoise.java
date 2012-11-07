package li.koly;


//Why to use generic?
//Cannot directly call methods with the exact type, coz it needs to do type check on compile time
//So most time, just do caculation or some other algorithm?
public class GenericNoise<T> {
    T a;
    GenericNoise(T t){
        this.a = t;
    }

    public GenericNoise() {
    }

    public String makeNoise(T a) {
        if (a instanceof Noise) {
            return ((Noise) a).makeNoise();
        }else {
            return null;
        }
    }

    public String roar() {
        return ((Roar) a).makeRoar();
    }
}
