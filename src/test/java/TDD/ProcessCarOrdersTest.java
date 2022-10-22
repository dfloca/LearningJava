package TDD;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;

/**
 * ProcessCarOrders will implement the following logic:
 *  - The input will be a randomized list of 20 CarOrders. (This is given. You do not need to code or test this.)
 *  - The processor will remove duplicates from the List. There should be 18 non-duplicate CarOrders.
 *      - There are a few ways to implement this. I suggest trying multiple to see what works best.
 *  - The processor will verify valid VINs. CarOrders with invalid VINs will be removed.
 *      - A valid VIN is exactly 17 characters in length.
 *      - There will be 8 invalid VINs.
 *  - The processor will verify that all orderDates are valid (not in the future).
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

    @Test
    void carOrdersGenerated() {
        final int NUM_CAR_ORDERS = 20;

        assert NUM_CAR_ORDERS == classUnderTest.carOrders.size();
    }
}