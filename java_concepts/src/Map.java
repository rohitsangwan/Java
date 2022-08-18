import java.util.*;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"Ro");
        map.put(11,"a");
        map.put(3,"b");
        map.put(8,"c");
        map.put(9,"c");
        for(java.util.Map.Entry<Integer, String> ma : map.entrySet()) {
            System.out.println(ma);
            int x = ma.getKey();
            String y = ma.getValue();
            System.out.println("Key: " + x + "\tValue: " + y);
        }
        String a = map.get(30);
        Set<Integer> list = map.keySet();
        Collection<String> val = map.values();
        Set<java.util.Map.Entry<Integer, String>> l = map.entrySet();
        System.out.println(list);
        System.out.println(val);
        System.out.println(l);
    }
}
