package Abstraction

import spock.lang.Specification

class PersonTest extends Specification {
    Person person

    void setup() {
        person = new Person()
    }

    void "GetName"() {
        given: "a person with a name"
        person.setName("Fred")

        when: "asked for their name"
        String name = person.getName()

        then: "we get the correct name"
        name == "Fred"
    }

    void "GetAge"() {
        given: "a person with an age"
        person.setAge(541)

        when: "asked for their age"
        int age = person.getAge()

        then: "we get the correct age"
        age == 541
    }
}
