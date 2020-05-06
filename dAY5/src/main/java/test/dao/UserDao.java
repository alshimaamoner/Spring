package test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
@Repository
public class UserDao  {

    private  String Msg="User Created";
    UserDao userDao;
    @Autowired
    public UserDao() {

        System.out.println("User Dao");
        Msg="hhhh";
    }


//        @Bean(name = "userDao", initMethod = "init", destroyMethod = "destroy")
//    @Scope("prototype")
//    public UserDao userDao(){
//                 return new UserDao();
//    }
   public void  cleanup(){
       System.out.println("Clean Up");
   }
    @PostConstruct
    public void init(){
        System.out.println("Init");
    }
    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }

     //@Inject
    public UserDao addUser(UserDao userDao){
        this.userDao=userDao;

        return userDao;
    }
    @Override
    public String toString() {
        return "UserDao{" +
                "Msg='" + Msg + '\'' +
                '}';
    }
}
