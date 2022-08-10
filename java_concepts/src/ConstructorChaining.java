class C{
    private int a;

    public C(){
        System.out.println("In base class constructor");
    }
}

class D extends C{
    public D(){
        this(10);
        System.out.println("In child class default constructor");
    }

    public D(int a){
        System.out.println("In child class parameterized constructor");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        D obj = new D();
    }
}
