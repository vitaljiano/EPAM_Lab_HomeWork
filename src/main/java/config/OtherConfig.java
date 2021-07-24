package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import others.OtherBeanA;
import others.OtherBeanC;

@Configuration
@ComponentScan("others")
public class OtherConfig {

    @Bean
    public OtherBeanA getOtherBeanA1(){
        return new OtherBeanA();
    }

    @Bean
    public OtherBeanA getOtherBeanA2(){
        return new OtherBeanA();
    }

    @Bean
    public OtherBeanC getOtherBeanC(@Qualifier("getOtherBeanA2") OtherBeanA myBean){
        return new OtherBeanC(myBean);
    }
}
