import java.util.ArrayList;
import java.util.Collections;

class Student1 {
    int rollNo;
    String name;

    public Student1(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
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

class CompareByRollNo implements java.util.Comparator<Student1> {
    public int compare(Student1 a, Student1 b){
        return a.rollNo - b.rollNo;
    }
}

class CompareByName implements java.util.Comparator<Student1> {
    public int compare(Student1 a, Student1 b){
        return a.name.compareTo(b.name);
    }
}

class CustomCompare implements java.util.Comparator<Student1>{

    public int compare(Student1 o1, Student1 o2) {
        int roll = o1.getRollNo() - o2.getRollNo();
        int name = o1.getName().compareTo(o2.getName());
        return (roll == 0) ? name : roll;
    }
}


public class Comparator {
    public static void main(String[] args) {
        ArrayList<Student1> arrayList = new ArrayList<>();
        arrayList.add(new Student1(2,"A"));
        arrayList.add(new Student1(3,"C"));
        arrayList.add(new Student1(1,"C"));
        arrayList.add(new Student1(4,"A"));
        arrayList.add(new Student1(7,"F"));
        arrayList.add(new Student1(3,"B"));
        System.out.println(arrayList);
        //Collections.sort(arrayList, new CompareByRollNo());
        //System.out.println(arrayList);
        //Collections.sort(arrayList, new CompareByName());
        Collections.sort(arrayList, new CustomCompare());
        System.out.println(arrayList);
    }
}
