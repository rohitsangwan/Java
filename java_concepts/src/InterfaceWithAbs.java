interface In{
    void method1();
}

abstract class absClass implements In{
    public absClass(){
        System.out.println("Inside abstract class constructor");
    }
    abstract void method2();
    static void method3(){
        System.out.println("Inside method 3");
    }
}

class Class1 extends absClass{
    public void method1(){
        System.out.println("Inside method 1");
    }
    public void method2(){
        System.out.println("Inside method 2");
    }
}
public class InterfaceWithAbs {
    public static void main(String[] args) {
        Class1 obj = new Class1();
        obj.method1();
        obj.method2();
        absClass.method3();
    }
}
