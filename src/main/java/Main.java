import Inheritance.Animal;
import Inheritance.Dog;
import Polymorphism.Cat;
import TDD.ProcessCarOrders;

import java.net.URISyntaxException;
import java.util.*;

/**
 * Order:
 *  1. Abstraction
 *  2. Inheritance
 *  3. Polymorphism
 *  4. Collections
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
         * 1. Implement a class called 'Person' with the following private attributes and methods:
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
         * If you tried to access the name or age attributes directly, you would get an exception because they are private.
         * You must use the getters and setters to access them. This is best practice.
         */
        //person.age = 40; // this will not work

        /**
         * 2. Implement a class called 'Animal' with the following attributes and methods:
         *      protected String color
         *      protected int numLegs
         *      protected String habitat
         *
         *      Public getters, setters, zero-arg constructor, 3-arg constructor
         *
         *    Implement a class called 'Dog' that extends 'Animal' and has the following attributes and methods:
         *      private String name
         *
         *      Public getters and setters
         *
         * The 'protected' access modifier means that only subclasses have access to them, otherwise they are private.
         */
//        Dog dog = new Dog();
//        dog.setColor("Black");
//        dog.setHabitat("House");
//        dog.setNumLegs(4);
//        dog.setName("Alfred");
//        System.out.println(dog.getName() + " is a " + dog.getColor() + " dog, with " + dog.getNumLegs() + " legs, and lives in a " + dog.getHabitat());
        /**
         * Notice that we did not need to define the color, habitat, or numLegs attributes within the Dog class in order
         * to have access to them.
         */

        /**
         * 3. Update the 'Animal' class by adding the method:
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
        /**
         * Notice how the cat object makes a different sound than what is defined in the Animal class.
         * This is because we used the @Override annotation to change the implementation of the makeSound() method.
         */

        /**
         * 4. Arrays in Java are pretty annoying.
         * We'll look at an example of creating an array, then replicate that behavior with other types of Collections.
         */
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }

        // Note the 'enhanced for'. This is syntactic sugar that makes for loop declaration cleaner, but performs the same
        for (int number : numbers) {
            System.out.print(number + ", ");
        }

        /**
         * For an array of just 5 numbers, this notation is not too tedious.
         * However, if we have an unknown number of elements, an array will not work because it cannot be resized.
         * Enter the List:
         */
        List<Integer> enhancedNumbers = new ArrayList<>(); // Note we do not need to declare a size
        for (int i = 0; i < 1000; i++) {
            enhancedNumbers.add(i * 2);
        }

        for (int number : enhancedNumbers) {
            System.out.print(number + ", ");
        }
        System.out.println();


        /**
         * Another useful Collection to know is the Set.
         * This interface will automatically remove duplicates.
         */
        Set<String> noDupes = new HashSet<>();
        noDupes.add("Tony");
        noDupes.add("Peter");
        noDupes.add("Thor");
        noDupes.add("Tony");

        for (String s : noDupes) {
            System.out.println(s);
        }
        /**
         * Notice that we added Tony to the Set twice, but that name only prints once.
         * Sets check for duplicates by using an object's equals() and hashCode() methods.
         * Interestingly, we can also implement these methods in our own classes to avoid adding duplicate objects.
         *
         * Generate the equals() and hashCode() methods on the 'Animal' class before proceeding.
         *      - Tip: let IntelliJ do the hard work for you here.
         */
        Set<Animal> animals = new HashSet<>();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Dog duplicateDog;

        dog.setColor("Black");
        dog.setHabitat("Home");
        dog.setNumLegs(4);

        cat.setColor("White");
        cat.setHabitat("None");
        cat.setNumLegs(3);

        duplicateDog = dog;

        animals.add(dog);
        animals.add(cat);
        animals.add(duplicateDog);

        for (Animal animal : animals) {
            // Implement a toString() method in the 'Animal' class to save us the trouble of typing out the animal's attributes
            // System.out.println(animal.toString());
        }

        /**
         * 5. A very useful collection is the HashMap.
         * Maps store key/value pairs.
         * Store and retrieve elements from a Map by using the key as an index.
         */
        HashMap<String, Integer> demo = new HashMap<>();
        demo.put("demo", 1);
        demo.put("demo2", 2);
        demo.replace("demo", demo.get("demo2") * 2);

        for (Map.Entry<String, Integer> entry : demo.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        /**
         * With Maps you cannot simply update the value as you would in a List.
         * You must use the replace() method.
         */

        /**
         * Using a HashMap, count the number of animals in the zoo (provided as a List)
         */
        List<Animal> animalZoo = generateZoo();
        HashMap<String, Integer> distinctAnimals = new HashMap<>();



        for (Map.Entry<String, Integer> entry : distinctAnimals.entrySet()) {
            System.out.println("There are " + entry.getValue() + " " + entry.getKey() + "s in the zoo");
        }

        /**
         * 6. Test Driven Development is a process where you write tests first, based on your requirements,
         * then implement the actual code to pass the tests.
         * TDD has three phases: Red -> Green -> Refactor
         * Red: Write a failing test
         * Green: Make the test pass (in the simplest way possible)
         * Refactor: improve code quality without changing behavior.
         * Head over to the test/TDD package CarOrderTest for the next part.
         *
         * After you are done with CarOrderTest, go to ProcessCarOrdersTest.
         */

    }

    public static List<Animal> generateZoo() {
        List<Animal> animalZoo = new ArrayList<>();

        Random rand = new Random();

        int numDogs = rand.nextInt(50);
        for (int i = 0; i < numDogs; i++) {
            animalZoo.add(new Dog());
        }
        System.out.println("SYSTEM - There should be " + numDogs + " dogs in the zoo.");

        int numCats = rand.nextInt(50);
        for (int i = 0; i < numCats; i++) {
            animalZoo.add(new Cat());
        }
        System.out.println("SYSTEM - There should be " + numCats + " cats in the zoo.");

        return animalZoo;
    }
}