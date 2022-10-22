package Abstraction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person;

    @BeforeEach
    void setUp() {
        person = new Person();
    }

//    @Test
//    void getName() {
//        person.setName("Fred");
//
//        String name = person.getName();
//
//        assert "Fred".equals(name);
//    }

//    @Test
//    void getAge() {
//        person.setAge(541);
//
//        int age = person.getAge();
//
//        assert 541 == age;
//    }
}