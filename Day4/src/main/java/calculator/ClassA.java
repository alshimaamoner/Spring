package calculator;

public class ClassA {
    private ClassB getB() {
        return b;
    }

    public void setB(ClassB b) {
        this.b = b;
    }

    public ClassB b;

   /* public ClassA(ClassB b) {
        this.b = b;
    }

    */

    @Override
    public String toString() {
        return "ClassA{" +
                "b=" + b +
                '}';
    }

    public void doSomeThing() {
        System.out.println("Class A");
    }
}
