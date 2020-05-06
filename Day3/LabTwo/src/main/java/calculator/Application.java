package calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
//        Calculator myBean= (Calculator) context.getBean("calculatorId");
//        System.out.println("Add :"+myBean.add(2,3));
//        System.out.println("Add :"+myBean.subtract(6,3));
//        System.out.println("Use Constructor Args:");
//        System.out.println("Pass String");
//        CalculatorImpl myBean2= (CalculatorImpl) context.getBean("calculatorId2");
//        System.out.println("Add :"+myBean2.getMsg());
//        System.out.println("Pass int");
//        CalculatorImpl myBean3= (CalculatorImpl) context.getBean("calculatorId3");
//        System.out.println("Add :"+myBean3.getNum());
//        System.out.println("Pass double");
//        CalculatorImpl myBean4= (CalculatorImpl) context.getBean("calculatorId4");
//        System.out.println("Add :"+myBean4.getNums());
//        System.out.println("Type Double");
//        CalculatorImpl myBean5= (CalculatorImpl) context.getBean("calculatorId5");
//        System.out.println("Add :"+myBean5.getNum());
//        System.out.println("Index ");
//        CalculatorImpl myBean6= (CalculatorImpl) context.getBean("calculatorId6");
//        System.out.println("Add :"+myBean6.getMsg());
//        System.out.println("Factory Method");
//        CalculatorImpl myBean7= (CalculatorImpl) context.getBean("calculatorId7");
//        System.out.println("Add :"+ CalculatorImpl.getInstance());
//        System.out.println("Factory Bean");
//        CalculatorImpl myBean8= (CalculatorImpl) context.getBean("calculatorId8");
//        System.out.println("Add :"+myBean8.addObject());
//        System.out.println("Constructor Based Injection");
//        DaoServiceImpl daoService= (DaoServiceImpl) context.getBean("Dao");
//        System.out.println(daoService);
        System.out.println("Auto Wiring By Name");
        DaoServiceImpl daoService2= (DaoServiceImpl) context.getBean("DaoService");
        System.out.println(daoService2.getUserDao());

//        System.out.println("AutoWiring by type");
//        CalculatorImpl parent= (CalculatorImpl) context.getBean("parent3");
//        System.out.println(parent.getAdmin().size());
//        /////////////////////////////////////////////////////////////////////
        UserDao user4 = (UserDao) context.getBean("userDao4") ;
        System.out.println("the Object FirstsTime of Create With Singleton "+ user4.toString());

        UserDao user10 = (UserDao) context.getBean("userDao4") ;
        System.out.println("the Object2 FirstsTime of Create With Singleton "+ user10.toString());

        UserDao user5 = (UserDao) context.getBean("userDao8") ;
        System.out.println("the object in second Calling " +user5.toString());

        ////////////////////////////////////////////////////////////////////////////////////

        UserDao user6 = (UserDao) context.getBean("userDao8") ;
        System.out.println("the Object FirstsTime of Create With Prototype "+ user6);


        //////////////////////////////////////////////////////////////////////////////////////////////////////
        UserDao userDao6 = (UserDao) context.getBean("userDao5") ;
        System.out.println("the LAzy Bean " + userDao6);

        /////////////////////////////////////////////////////////////////////////////////////////
        UserDao user8 = (UserDao) context.getBean("userDao6");
        System.out.println("init CallBack By Interface " + user8);

        ////////////////////////////////////////////////////////////////////////////////
        UserDao user9 = (UserDao) context.getBean("userDao7");
        System.out.println("init & Destroy CallBack By Custome Method " + user9);

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        Parent parent1 = (Parent)  context.getBean("parent6");
        System.out.println("Bean Definition Inheritance " + parent1 );

        ///////////////////////////////////////////////////////////////////////////////////////////////////

        Child child1 = (Child)  context.getBean("child");
        System.out.println("Bean Definition Inheritance " + child1 );

        ///////////////////////////////////////////////////////////////////////////////////////////////////







    }
}
