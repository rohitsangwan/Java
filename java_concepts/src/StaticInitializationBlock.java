class StaticBlockTest{
    private static int a;
    static {
        System.out.println("Value of a: " + a);
        a = 10;
    }
    public StaticBlockTest(){
        System.out.println("Value of a: " + a);
    }
}

public class StaticInitializationBlock {
    public static void main(String[] args) {
        StaticBlockTest staticBlockTest = new StaticBlockTest();
    }
}
