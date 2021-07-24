package config;

import beans3.BeanD;
import beans3.BeanF;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("beans2")
@ComponentScan(basePackageClasses = {BeanD.class, BeanF.class})
public class AppConfigSecond {

}
