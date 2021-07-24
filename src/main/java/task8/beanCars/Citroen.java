package task8.beanCars;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import task8.Car;

@Component
@Primary
public class Citroen implements Car {
    @Override
    public void getCar() {
        System.out.println("Citroen");
    }
}
