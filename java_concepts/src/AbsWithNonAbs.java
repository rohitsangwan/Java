abstract class Animal{
    abstract void run();
    static int speed(){
        return 10;
    }
}

class Dog extends Animal{
    public void run(){
        System.out.println("Running");
    }
}
public class AbsWithNonAbs {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.run();
        System.out.println("Speed of the animal: " + Animal.speed());
    }
}