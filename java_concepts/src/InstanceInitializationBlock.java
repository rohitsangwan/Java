class InstanceBlockTest{
    private int x;

    //Instance initialization block
    {
        System.out.println("Value of x: " + x);
        x = 5;
    }
    public InstanceBlockTest(){
        System.out.println("Value of x: " + x);
    }
}

public class InstanceInitializationBlock {
    public static void main(String[] args) {
        InstanceBlockTest obj = new InstanceBlockTest();
    }
}
