package li.koly;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AnimalTest {

    //Inheritance
    @Test
    public void should_return_dog_run() {
        Animal animal = new Dog();
        assertThat(animal.run(), is("The dog is running!"));
    }

    //Interface
    @Test
    public void should_return_bird_make_noise() {
        Noise noise = new Bird();
        assertThat(noise.makeNoise(), is("A bird is making noise!"));
    }

    //Interface
    @Test
    public void should_return_dog_make_noise() {
        Noise dog = new Dog();
        assertThat(dog.makeNoise(), is("A Dog is making noise!"));
    }

    //Generic & using Interface
    @Test
    public void should_Dog_and_Bird_make_noise() {
        GenericNoise genericNoise = new GenericNoise();
//        GenericNoise<Dog> genericNoise = new GenericNoise();
        assertThat(genericNoise.makeNoise(new Dog()), is("A Dog is making noise!"));
        assertThat(genericNoise.makeNoise(new Bird()), is("A bird is making noise!"));
    }

    //Generic & inheritance
    @Test
    public void should_print_Dog_and_Bird() {
        GenericNoise genericRoar = new GenericRoar(new Dog(), new Bird());
        assertThat(genericRoar.toString(), is("Dog and Bird"));
    }

    //Generic, inheritance, and call interface
    @Test
    public void should_Dog_and_bird_roar() {
        GenericNoise genericNoise = new GenericRoar(new Dog(), new Bird());
        assertThat(genericNoise.roar(), is("A Dog is roaring!\nA Bird is roaring!"));
    }

    @Test
    public void should_Dog_roar() {
        GenericNoise genericNoise = new GenericNoise(new Dog());
        assertThat(genericNoise.roar(), is("A Dog is roaring!"));
    }
}
