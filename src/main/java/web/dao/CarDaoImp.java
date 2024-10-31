package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao{
    private final List<Car> cars;

    public CarDaoImp(){
        cars=new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2020));
        cars.add(new Car("Honda", "Civic", 2019));
        cars.add(new Car("Ford", "Mustang", 2021));
        cars.add(new Car("Chevrolet", "Impala", 2018));
        cars.add(new Car("Nissan", "Altima", 2022));
    }
    @Override
    public List<Car> getAllCars() {
        return cars;
    }
    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars; // Возвращаем весь список
        } else {
            return cars.stream().limit(count).collect(Collectors.toList()); // Возвращаем указанное количество машин
        }
    }
}
