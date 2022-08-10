interface I{
    void m1();
}

interface J{
    void m2();
}

class K implements I, J{
    public void m1(){
        System.out.println("Method 1 is running");
    }

    public void m2(){
        System.out.println("Method 2 is running");
    }
}
public class InterfaceWithClass {
    public static void main(String[] args) {
        K obj = new K();
        obj.m1();
        obj.m2();
    }
}
