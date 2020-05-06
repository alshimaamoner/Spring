
import org.springframework.core.env.Environment;
import test.config.*;
import test.dao.DaoServiceImpl;
import test.dao.ProductDao;
import test.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {
       // ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
//        ManagerService service = context2.getBean(ManagerService.class);
//        Manager manager = service.getManager();
//        System.out.println(manager.getManagerName());
        //        Employee employee = context2.getBean(Employee.class);
//        System.out.println(employee);
        AnnotationConfigApplicationContext context2
                = new AnnotationConfigApplicationContext();
        context2.getEnvironment().setActiveProfiles("production");
         context2.register(Config.class);
         context2.register(ModelConfig.class);
         context2.register(AppConfig.class);
         context2.refresh();
        Environment env=context2.getEnvironment();
         boolean containsMyProperty=env.containsProperty("JAVA_HOME");
        System.out.println("contains My Property result is "+containsMyProperty);
//        System.out.println("Beans with Differnet Name");
//        Employee employee2 = (Employee) context2.getBean("tonyEmployee");
//        System.out.println(employee2);
        System.out.println("using Bean with Init ");
        UserDao userDao = (UserDao) context2.getBean("userDao");
        System.out.println(userDao);
//        System.out.println("using Bean with empty Init,empty destroy ");
//        ProductDao productDao = (ProductDao) context2.getBean("productDao");
//        System.out.println(productDao);
        System.out.println("Using ProtoType");
        DaoServiceImpl daoService=(DaoServiceImpl) context2.getBean("daoService");
        daoService.getUserDao().setMsg("shimaaaaaaaaaaaaaaaaa");
        System.out.println(daoService);
//        DaoServiceImpl daoService2=(DaoServiceImpl) context2.getBean("daoService2");
//        System.out.println(daoService2);
//        System.out.println("Import Beaan.Xml");
//        Employee employee3 = (Employee) context2.getBean("john");
//        System.out.println(employee3);
//        System.out.println("Using PlaceHolder");
//        DataSource dataSource=(DataSource)context2.getBean("dataSource");
//        List<String> result=Test.showData(dataSource,"shimaa");
//        result.forEach(s -> System.out.println("result is "+s));




    }
}
