package task7.listBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import task7.Animal;

import java.util.ArrayList;
import java.util.List;

@Component
@Qualifier("listAnimals")
public class ListAnimals {
    List<Animal> animalList;

    @Autowired
    public ListAnimals(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void animalsSay() {
        for (Animal animal : animalList) {
            animal.voice();
        }
    }
}
