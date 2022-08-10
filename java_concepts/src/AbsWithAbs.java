abstract class P{
    abstract void read();

    static void speak() {
        System.out.println("Speaking");
    }
}

abstract class Q extends P{
    abstract void write();
}

class R extends P{
    void write(){
        System.out.println("Writing");
    }
    void read(){
        System.out.println("Reading");
    }
}
public class AbsWithAbs {
    public static void main(String[] args) {
        R obj = new R();
        obj.write();
        obj.read();
        P.speak();
    }
}
