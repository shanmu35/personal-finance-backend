package com.example.finance_backend;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class Car {
	@Autowired
    private Engine engine;

    public void drive() {
        System.out.println(engine.start());
        System.out.println("Car is running ");
    }

}
