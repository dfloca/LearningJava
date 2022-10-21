package Inheritance

import spock.lang.Specification

class DogTest extends Specification {
    Dog dog
    void setup() {
        dog = new Dog()
    }

    void cleanup() {
    }

    void "GetColor"() {
        given: "a dog with a color"
        dog.setColor("Black")

        when: "we ask for the color of the dog"
        String color = dog.getColor()

        then: "we get the correct color"
        color == "Black"
    }

    void "GetNumLegs"() {
        given: "a dog with legs"
        dog.setNumLegs(4)

        when: "we ask for the number of legs"
        int numLegs = dog.getNumLegs()

        then: "we get the correct number of legs"
        numLegs == 4
    }

    void "GetHabitat"() {
        given: "a dog with a habitat"
        dog.setHabitat("Street")

        when: "we ask for the habitat"
        String habitat = dog.getHabitat()

        then: "we get the correct habitat"
        habitat == "Street"
    }

    void "MakeSound"() {
        given: "a dog that makes a sound"

        when: "we ask for it to make a sound"
        String sound = dog.makeSound()

        then: "we get the correct sound"
        sound == "Woof Woof!"
    }

    def "GetName"() {
        given: "a dog with a name"
        dog.setName("Ripper")

        when: "we ask for the name"
        String name = dog.getName()

        then: "we get the correct name"
        name == "Ripper"
    }
}
