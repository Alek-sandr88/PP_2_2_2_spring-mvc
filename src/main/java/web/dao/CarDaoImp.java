package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car(7, "Bmv", "red"));
        carList.add(new Car(53, "Opel", "black"));
        carList.add(new Car(5, "Kia", "blue"));
        carList.add(new Car(204, "Reno", "red"));
        carList.add(new Car(100, "Fiat", "black"));
    }

    @Override
    public List<Car> getListCar(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
