package calculator;

import calculator.config.*;
import calculator.dao.DaoServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

        DaoServiceImpl daoService= (DaoServiceImpl) context.getBean("daoServiceImpl");
        daoService.getUserDao().setMsg("kkk");
        System.out.println(daoService);
//        DaoServiceImpl daoService2= (DaoServiceImpl) context.getBean("dao2ServiceImpl");
//        System.out.println(daoService);
        //////////////////////////////////////////////////////////////////
//
        AnnotationConfigApplicationContext context2
                = new AnnotationConfigApplicationContext();
         context2.register(Config.class);
         context2.register(ModelConfig.class);
         context2.refresh();
//        ManagerService service = context2.getBean(ManagerService.class);
//        Manager manager = service.getManager();
//        System.out.println(manager.getManagerName());
        Employee employee2 = (Employee) context.getBean("tonyEmployee");
        System.out.println(employee2);
        Employee employee = context2.getBean(Employee.class);
        System.out.println(employee);


    }
}
