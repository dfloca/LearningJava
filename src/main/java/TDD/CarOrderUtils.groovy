package TDD;

import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class CarOrderUtils {

    static List<CarOrder> generateCarOrders() throws URISyntaxException {
        List<CarOrder> carOrders = new ArrayList<>();

        for(int i = 0; i < 20; i++) {
            CarOrder carOrder = new CarOrder();

            if (i == 7 || i == 19) {
                carOrder = carOrders.get(0);
                carOrders.add(carOrder);
            }
            else {
                carOrder.setOrderDate(generateOrderDate());
                carOrder.setVin(generateVIN(i));

                carOrders.add(carOrder);
            }
        }

        return carOrders;
    }

    private static LocalDate generateOrderDate() {
        Random rand = new Random();

        int minDay = (int) LocalDate.of(1990, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2022, 1, 1).toEpochDay();
        long randomDay = minDay + rand.nextInt(maxDay - minDay);

        return LocalDate.ofEpochDay(randomDay);
    }

    private static String generateVIN(int index) throws URISyntaxException {
        if (index % 2 == 0)
            return VINGenerator.getRandomVin();
        else if (index % 3 == 0)
            return VINGenerator.getRandomVin() + "" + VINGenerator.getRandomVin();
        else if (index % 5 == 0)
            return VINGenerator.getRandomVin().substring(1, 9);
        return "";
    }
}
