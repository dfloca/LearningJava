package TDD;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ProcessCarOrders will implement the following logic:
 *  - The input will be a randomized list of CarOrders. (This is given. You do not need to code or test this.)
 *  - The processor will remove duplicates from the List.
 *      - There are a few ways to implement this. I suggest trying multiple to see what works best.
 *  - The processor will verify valid VINs. CarOrders with invalid VINs will be removed.
 *  - The processor will verify that orderDates are valid. Invalid orders will be removed.
 *  - The processor will sort the orders from oldest to newest, based on orderDate.
 *  - The processor will return the sorted List of carOrders.
 */
class ProcessCarOrdersTest {
    ProcessCarOrders classUnderTest;

    @BeforeEach
    void setUp() throws URISyntaxException {
        classUnderTest = new ProcessCarOrders();
    }

    @AfterEach
    void tearDown() {

    }
}