import java.util.HashSet;

public class HSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(1);
        hashSet.add(11);
        hashSet.add(98);
        hashSet.add(212);
        hashSet.remove(1);
        for(int h : hashSet){
            System.out.println(h);
        }
    }
}
