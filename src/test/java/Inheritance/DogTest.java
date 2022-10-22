package Inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog dog;

    @BeforeEach
    void setUp() {
        dog = new Dog();
    }

    @Test
    void getColor() {
        dog.setColor("Black");

        String color = dog.getColor();

        assert "Black".equals(color);
    }

    @Test
    void getNumLegs() {
        dog.setNumLegs(4);

        int numLegs = dog.getNumLegs();

        assert 4 == numLegs;
    }

    @Test
    void getHabitat() {
        dog.setHabitat("Street");

        String habitat = dog.getHabitat();

        assert "Street".equals(habitat);
    }

    @Test
    void makeSound() {
        String sound = dog.makeSound();

        assert "Woof Woof!".equals(sound);
    }

//    @Test
//    void getName() {
//        dog.setName("Ripper");
//
//        String name = dog.getName();
//
//        assert "Ripper".equals(name);
//    }
}