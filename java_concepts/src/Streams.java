import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,3,6,7,2);
        for(Integer i : list)
            System.out.println("Numbers: " + i);

        List<Integer> newList = list.stream().map(integer -> integer * integer).collect(Collectors.toList());
        for(Integer i : newList)
            System.out.println("Square: " + i);

        List<Integer> even = list.stream()
                .filter(e->e%2==0).collect(Collectors.toList());

        for(Integer i : even)
            System.out.println("Even: " + i);
    }
}
