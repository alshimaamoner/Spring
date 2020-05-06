package test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import test.dao.UserDao;

@Configuration
@ComponentScan(basePackages="test")
@ImportResource("classpath:beans.xml")
@Production
public class AppConfig {
    @Autowired
    Config config;
    public UserDao userDao(){
        return config.userDao();
    }
    @Value("${jdbc.driverClassName}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private  String password;

    @Bean(name = "dataSource")
   // @Production
   // @Profile("development")
    public DataSource dataSource() {
        test.config.DataSource dataSource =new test.config.DataSource(url,driver,username,password);
        return dataSource;
    }
}
