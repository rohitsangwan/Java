class Abcd{
    static int a=10;
}

class F extends Abcd{
    static int a=20;
}
public class Main {
    public static void main(String[] args) {
        F obj = new F();
        System.out.println(obj.a);

    }
}