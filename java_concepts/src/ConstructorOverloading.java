class A{
    private int a;
    A(){
        a=10;
        System.out.println("Value of a: " + a);
    }
    A(int a){
        this.a = a;
        System.out.println("Value of a: " + a);
    }
    A(int a, String z){
        this.a = a;
        System.out.println("Value of a: " + a);
        System.out.println("String: " + z);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A(20);
        A obj3 = new A(30, "Hello");
    }
}
