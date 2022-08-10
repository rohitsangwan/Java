class Employee{
    double salary;
    public Employee(){
        salary = 50000;
    }
    public Employee(int salary){
        this.salary = salary;
    }
    private void displaySalary(){
        System.out.println(salary);
    }
}

class FullTimeEmployee extends Employee{
    private double hike = 0.5;
    double incrementSalary(){
        salary = salary + (salary * hike);
        return salary;
    }
}

class Intern extends Employee{
    private double hike = 0.25;
    double incrementSalary(){
        salary = salary + (salary * hike);
        return salary;
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        Intern intern = new Intern();
        System.out.println("Salary before increment: " + "\nFull time: " + fullTimeEmployee.salary + "\nIntern :" + intern.salary);
        System.out.println("Salary after increment: " + "\nFull time: " + fullTimeEmployee.incrementSalary() + "\nIntern :" + intern.incrementSalary());
    }
}
