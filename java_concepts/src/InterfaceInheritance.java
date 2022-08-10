interface Eat{
    void eat();
}

interface Walk{
    void walk();
}

class Animals implements Eat, Walk{
    public void eat(){
        System.out.println("Animal is eating!");
    }

    public void walk(){
        System.out.println("Animal is walking!");
    }
}
public class InterfaceInheritance {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.eat();
        animals.walk();
    }
}
