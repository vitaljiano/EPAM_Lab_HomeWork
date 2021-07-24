package task7.beanAnimals;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import task7.Animal;

@Component
@Order(3)
public class Rabbit implements Animal {
    @Override
    public void voice() {
        System.out.println("Frrrr");
    }
}
