package Inheritance;

import java.util.Objects;

/**
 * In Java, as with many other languages, it is possible to inherit attributes
 * and methods from one class to another. Inheritance is grouped into two categories:
 *  - subclass (child) - the class that inherits from another class
 *  - superclass (parent) - the class being inherited from
 *
 *  Implement 'Animal' as a superclass.
 */
public abstract class Animal {
    protected String color;
    protected int numLegs;
    protected String habitat;

    public Animal() {}

    public Animal(String color, int numLegs, String habitat) {
        this.color = color;
        this.numLegs = numLegs;
        this.habitat = habitat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String makeSound() {
        return "Abstract animals do not make sounds.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getNumLegs() == animal.getNumLegs() && getColor().equals(animal.getColor()) && getHabitat().equals(animal.getHabitat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getNumLegs(), getHabitat());
    }

    @Override
    public String toString() {
        return "Color: " + color +
                ", Number of Legs: " + numLegs +
                ", Habitat: " + habitat;
    }
}
