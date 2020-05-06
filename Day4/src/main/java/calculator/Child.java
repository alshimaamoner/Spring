package calculator;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Child {
    private String name ;
    private int age ;
    private String address;
    List<String> listChild;
    Set<String> setChild ;
    Map<String,String> mapChild ;

    public Child() {
    }

    public Child(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public List<String> getListChild() {
        return listChild;
    }

    public void setListChild(List<String> listChild) {
        this.listChild = listChild;
    }

    public Set<String> getSetChild() {
        return setChild;
    }

    public void setSetChild(Set<String> setChild) {
        this.setChild = setChild;
    }

    public Map<String, String> getMapChild() {
        return mapChild;
    }

    public void setMapChild(Map<String, String> mapChild) {
        this.mapChild = mapChild;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", listChild=" + listChild +
                ", setChild=" + setChild +
                ", mapChild=" + mapChild +
                '}';
    }
}
