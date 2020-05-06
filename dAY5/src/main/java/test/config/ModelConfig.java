package test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
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
