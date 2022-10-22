package Polymorphism;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat cat;

    @BeforeEach
    void setUp() {
        cat = new Cat();
    }

    @Test
    void makeSound() {
        String sound = cat.makeSound();

        assert "Meow!".equals(sound);
    }
}