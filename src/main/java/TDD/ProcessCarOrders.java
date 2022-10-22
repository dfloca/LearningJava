package TDD;

import java.net.URISyntaxException;
import java.util.List;

public class ProcessCarOrders {
    private List<CarOrder> carOrders;

    public ProcessCarOrders() throws URISyntaxException {
        carOrders = CarOrderUtils.generateCarOrders();
//        for (CarOrder carOrder : carOrders){
//            System.out.println(carOrder.toString());
//        }
    }
}
