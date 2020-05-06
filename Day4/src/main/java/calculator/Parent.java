package calculator;

import java.util.List;

public class Parent {
    private String name ;
    private int age ;
    List<String> listparent;

    public Parent() {
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public List<String> getListparent() {
        return listparent;
    }

    public void setListparent(List<String> listparent) {
        this.listparent = listparent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
