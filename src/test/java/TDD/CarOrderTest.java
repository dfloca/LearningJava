package TDD;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * We are going to create a class called CarOrder.
 * Remember that with TDD, we implement the least amount of functionality required to get the tests to run.
 * Also remember: red, green, refactor.
 * For TDD to be successful, we must have well-defined requirements.
 * The attributes and members of CarOrder are as follows:
 *      private String year
 *      private String vin
 *      private LocalDate orderDate
 *
 *      public CarOrder()
 *
 *      public String toString
 *
 *      public getters and setters for all attributes
 *
 * The first test will be provided for you.
 */
class CarOrderTest {
    CarOrder carOrder;

    // BeforeEach and AfterEach methods are important for keeping our code clean.
    // As the names imply, they run before and after each test.
    // Use them as you see necessary.
    @BeforeEach
    void setUp() {
        carOrder = new CarOrder();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    public void getYear_ReturnsCorrectYear() {
        String expectedYear = "2020";
        carOrder.setYear(expectedYear);

        assertEquals(expectedYear, carOrder.getYear());
    }

    @Test
    public void getVIN_ReturnsCorrectVIN() {

    }

    @Test
    public void getOrderDate_ReturnsCorrectOrderDate() {

    }

    @Test
    public void toString_ReturnsFormattedString() {

    }
}