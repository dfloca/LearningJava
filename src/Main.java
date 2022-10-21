import Abstraction.Person;
import Inheritance.Animal;
import Inheritance.Dog;
import Polymorphism.Cat;

/**
 * Order:
 *  1. Abstraction
 *  2. Inheritance
 *  3. Polymorphism
 *  4. Arrays
 *  5. Maps
 *  6. Sorting
 *  7. String-Date Manipulation
 *  8. Test Driven Development
 *  9. Putting it all together
 *
 *  Instructions:
 *  Go section by section and solve the coding problems.
 *  Uncomment completed lines to test that your solution is working.
 *  When you reach the TDD section, you will be running test classes instead.
 */

public class Main {
    public static void main(String[] args) {
        /**
         * 1. Implement a class called 'Person' with the following private members:
         *      private String name
         *      private int age
         *
         *      public String getName
         *      public void setName(String name)
         *      public int getAge
         *      public void setAge(int age)
         *
         *      public Person()
         *      public Person(String name, int age)
         */
//        Person personTesty = new Person("Testy McTestyson", 99);
//        Person person = new Person();
//        person.setName("Bruce Wayne");
//        person.setAge(50);
//        System.out.println(personTesty.getName() + " is older than " + person.getName() + " by " + (personTesty.getAge() - person.getAge()) + " years!");

        /**
         * 2. Implement a class called 'Animal' with the following members:
         *      protected String color
         *      protected int numLegs
         *      protected String habitat
         *
         *      Public getters, setters, zero-arg constructor, 3-arg constructor
         *
         *    Implement a class called 'Dog' that extends 'Animal' and has the following member:
         *      private String name
         *
         *      Public getters and setters
         *
         * The 'protected' access modifier means that only subclasses have access to them.
         */
//        Dog dog = new Dog();
//        dog.setColor("Black");
//        dog.setHabitat("House");
//        dog.setNumLegs(4);
//        dog.setName("Alfred");
//        System.out.println(dog.getName() + " is a " + dog.getColor() + " dog, with " + dog.getNumLegs() + " legs, and lives in a " + dog.getHabitat());

        /**
         * 3. Update the 'Animal' class by adding:
         *      public String makeSound()
         *    Return any string literal of your choosing.
         *
         * Implement a class called 'Cat' that extends 'Animal' and overrides makeSound().
         * Return "Meow!"
         */
//        Cat cat = new Cat();
//        cat.setColor("Orange");
//        cat.setHabitat("Tree");
//        cat.setNumLegs(4);
//        System.out.println("The cat is " + cat.getColor() + ", with " + cat.getNumLegs() + " legs, lives in a " + cat.getHabitat()
//                + ", and makes the sound: " + cat.makeSound());
    }
}