package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {
    private List<Car> listOfCars;

    {
        listOfCars = new ArrayList<>();
        listOfCars.add( new Car("VW", "red", 4));
        listOfCars.add( new Car("BMW", "black", 4));
        listOfCars.add( new Car("VAZ", "yellow", 4));
        listOfCars.add( new Car("AUDI", "pink", 4));
        listOfCars.add( new Car("ZAZ", "green", 4));
    }

    @Override
    public List<Car> showCar(Integer count) {
        if(count==null){
            count=5;
        }
        return listOfCars.stream().limit(count).collect(Collectors.toList());
    }
}
