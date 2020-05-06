package calculator;

public class ClassB {
    private ClassA a;
    public ClassA getA() {
        return a;
    }

    public void setA(ClassA a) {
        this.a = a;
    }



   /* public ClassB(ClassA a) {
        this.a = a;
    }

    */

    @Override
    public String toString() {
        return "ClassB{" +
                "a=" + a +
                '}';
    }
    public void doSomeThing() {
        System.out.println("Class b");
    }
}
