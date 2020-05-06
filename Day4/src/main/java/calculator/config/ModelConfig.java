package calculator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ModelConfig {
    @Bean
    public Manager JohnManager() {
        return new DepartmentManager();
    }

    @Bean
    @Primary
    public Manager TonyManager() {
        return new GeneralManager();
    }
}
