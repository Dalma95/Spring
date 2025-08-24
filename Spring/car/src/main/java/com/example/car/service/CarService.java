package com.example.car.service;

import com.example.car.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars = new ArrayList<>();

    public void add(Car car){
        cars.add(car);
    }

    public List<Car> findAll(){
        return cars;
    }
}
