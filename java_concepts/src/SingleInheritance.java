
class Abc{
    float a = 100_000;
    private static int b = 5_000;
    static int c = 10;
    protected int d = 1;

    static void display(){
        System.out.println(b);
    }
}

class B extends Abc{
    int z = 20_000;
}
public class SingleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.a);
        System.out.println(obj.z);
        System.out.println(Abc.c);
        System.out.println(obj.d);
        Abc.display();
    }
}
