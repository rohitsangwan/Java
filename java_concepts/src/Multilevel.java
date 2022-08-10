class Cuboid{
    private int height;
    private int width;
    private int length;
    Cuboid(int h, int w, int l){
        height = h;
        width = w;
        length = l;
    }

    protected int volume(){
        return length * width * height;
    }

    private int areaOfBase(){
        return length * width;
    }
    static String colour(){
        return "Blue";
    }
    static String colour(int a){return "Green";}
}

class WeightOfCuboid extends Cuboid{
    int weight;
    WeightOfCuboid(int h, int w, int l, int weight){
        super(h,w,l);
        this.weight = weight;
    }
}

class Cost extends WeightOfCuboid{
    double cost;
    Cost(int h, int w, int l, int weight, double cost){
        super(h,w,l,weight);
        this.cost = cost;
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Cost obj1 = new Cost(2,3,1,10,50);
        System.out.println("Volume: " + obj1.volume());
        System.out.println("Cost: " + obj1.weight);
        System.out.println("Cost: " + obj1.cost);
        System.out.println("Color: " + Cuboid.colour());
        System.out.println(obj1.colour());
        System.out.println(Cuboid.colour(2));
    }
}
