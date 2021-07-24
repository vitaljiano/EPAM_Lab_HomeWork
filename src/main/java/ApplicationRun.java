import config.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import task7.listBeans.ListAnimals;
import task8.InjectionBeansInterface;

public class ApplicationRun {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConf.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        ApplicationContext contextSecond = new AnnotationConfigApplicationContext(AppConfigSecond.class);
        for (String beanDefinitionName : contextSecond.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        ApplicationContext otherContext = new AnnotationConfigApplicationContext(OtherConfig.class);
        for (String beanDefinitionName : otherContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        ApplicationContext contextAnimal = new AnnotationConfigApplicationContext(AnimalsConfig.class);
        contextAnimal.getBean(ListAnimals.class).animalsSay();

        ApplicationContext contextCars = new AnnotationConfigApplicationContext(CarConfig.class);
        for (String beanDefinitionName : contextCars.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }


}
