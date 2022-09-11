package web.DAO;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDAO {
    private final List<Car> cars;
    CarDAO() {
        cars = new ArrayList<>();
        cars.add(new Car(1L, "CarName1", 101));
        cars.add(new Car(2L, "CarName2", 102));
        cars.add(new Car(3L, "CarName3", 103));
        cars.add(new Car(4L, "CarName4", 104));
        cars.add(new Car(5L, "CarName5", 105));
    }

    public List<Car> getCarList (int count) {
        return cars.subList(0, count);
    }

}
