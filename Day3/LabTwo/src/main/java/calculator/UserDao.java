package calculator;

public class UserDao {
    String Msg="User Created";

    public UserDao() {
        System.out.println("User Dao");
    }
    public void init(){
        System.out.println("Init");
    }
    public void destroy(){
        System.out.println("destroy");
    }
    @Override
    public String toString() {
        return "UserDao{" +
                "Msg='" + Msg + '\'' +
                '}';
    }
}
