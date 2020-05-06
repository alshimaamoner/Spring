package calculator.dao;

import calculator.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("userDao")
public class UserDao implements User {

    private  String Msg="User Created";
    UserDao userDao;
    @Autowired
    public UserDao() {

        System.out.println("User Dao");
        Msg="hhhh";
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

    public void addUser(UserDao userDao){
        this.userDao=userDao;

    }
    @Override
    public String toString() {
        return "UserDao{" +
                "Msg='" + Msg + '\'' +
                '}';
    }
}
