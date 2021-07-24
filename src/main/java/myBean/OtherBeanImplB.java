package myBean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import others.OtherBeanA;

@Component
public class OtherBeanImplB {
    @Bean
    public OtherBeanA getBeanA1() {
        return new OtherBeanA();
    }
    @Bean
    public OtherBeanA getBeanA() {
        return new OtherBeanA();
    }

}

