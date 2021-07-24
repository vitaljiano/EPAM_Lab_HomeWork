package task8.beanCars;

import org.springframework.stereotype.Component;
import task8.Car;

@Component
public class BMW implements Car {
    @Override
    public void getCar() {
        System.out.println("BMW");
    }
}
