package Polymorphism

import spock.lang.Specification

class CatTest extends Specification {
    Cat cat

    void setup() {
        cat = new Cat()
    }

    void "MakeSound"() {
        given: "a cat that makes a sound"

        when: "asked to make a sound"
        String sound = cat.makeSound()

        then: "makes the correct sound"
        sound == "Meow!"
    }
}
