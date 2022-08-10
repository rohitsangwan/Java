class MyGenericClass<T,U>{
    T a;
    U b;
    MyGenericClass(T a, U b){
        this.a = a;
        this.b = b;
    }
    void print(){
        System.out.println(a);
        System.out.println(b);
    }
}

public class Generics {
    public static void main(String[] args) {
        MyGenericClass<Integer, String> obj = new MyGenericClass<Integer, String>(10, "Abc");
        obj.print();
    }
}
