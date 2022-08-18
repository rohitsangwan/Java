import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class AList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(3);
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(arrayList);
//        for(int a : hashSet)
//            System.out.println(a);
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.addAll(hashSet);
        for(int a : arrayList1)
            System.out.println(a);
//        List<Integer> newArrayList = arrayList.stream().filter(e->e%2==0).collect(Collectors.toList());
//        for (int a : newArrayList)
//            System.out.println(a);
    }
}
