package calculator.config;

import java.util.Map;

public class Employee {

    private String msg;
    public Employee(String john) {
        msg=john;
    }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
