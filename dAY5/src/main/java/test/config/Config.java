package test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import test.dao.DaoServiceImpl;
import test.dao.ProductDao;
import test.dao.UserDao;

@Configuration
@ComponentScan(basePackages="test")
@ImportResource("classpath:beans.xml")
@Import(AppConfig.class)
@Production
public class Config {
    @Autowired
    UserDao userDao;

    @Bean({"john","emp"})
    public Employee JohnEmployee() {
        return new Employee("John");
    }

    @Bean(name = "tonyEmployee")
    public Employee TonyEmployee() {
        return new Employee("Tony");
    }

//    @Bean(name = "userDao",initMethod = "init",destroyMethod = "destroy")
//    @Scope("prototype")

    public UserDao userDao(){
                 return new UserDao();
    }
//    @Bean(name = "productDao",initMethod = "",destroyMethod = "")
//    public ProductDao productDao(){
//        return new ProductDao();
//    }
    @Bean(name = "daoService")
   public  DaoServiceImpl daoService(UserDao userDao,ProductDao dao){
        return  new DaoServiceImpl(userDao,dao);
   }
    @Bean(name = "daoService2")
    public  DaoServiceImpl daoService2(){
        return  new DaoServiceImpl(new UserDao(),new ProductDao());
    }


}


// @Primary