import java.util.ArrayList;
import java.util.Collections;
class Student2 implements java.lang.Comparable<Student2>{
    int rollNo;
    String name;

    public Student2(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public int compareTo(Student2 a) {
        int r = this.getRollNo().compareTo(a.getRollNo());
        int n = this.getName().compareTo(a.getName());
        return (r==0) ? n : r;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString()
    {
        return this.rollNo + " " + this.name;
    }

}

public class Comparable {
    public static void main(String[] args) {
        ArrayList<Student2> arrayList = new ArrayList<>();
        arrayList.add(new Student2(2,"A"));
        arrayList.add(new Student2(3,"C"));
        arrayList.add(new Student2(1,"C"));
        arrayList.add(new Student2(4,"A"));
        arrayList.add(new Student2(7,"F"));
        arrayList.add(new Student2(3,"B"));
        System.out.println(arrayList);
        //Collections.sort(arrayList, new CompareByRollNo());
        //System.out.println(arrayList);
        //Collections.sort(arrayList, new CompareByName());
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
