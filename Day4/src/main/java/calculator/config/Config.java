package calculator.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages="calculator")
public class Config {
    Employee employee;
    @Autowired
    Manager manager;
    @Bean
    public Employee JohnEmployee() {
        return new Employee("John");
    }

    @Bean(name = "tonyEmployee")
  // @Primary
    public Employee TonyEmployee() {
        return new Employee("Tony");
    }

}
