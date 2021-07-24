package task8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class InjectionBeansInterface {
    final Car car1;
    final Car car2;
    final Car car3;

    @Autowired
    public InjectionBeansInterface(Car car1, @Qualifier("BMW") Car car2, @Qualifier("opel") Car car3) {
        this.car1 = car1;
        this.car2 = car2;
        this.car3 = car3;
    }
}
