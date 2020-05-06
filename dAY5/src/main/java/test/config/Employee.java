package test.config;

import org.springframework.stereotype.Component;

public class Employee {

    private String msg;
    public Employee(){}
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
