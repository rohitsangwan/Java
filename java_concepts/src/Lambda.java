
@FunctionalInterface
interface Calculator{
    int add(int num1, int num2);
}

public class Lambda {
    public static void main(String[] args) {
        Calculator calculator = (num1, num2)->{
            int res;
            System.out.println("Addition of " + num1 + " and " + num2 + " is: " + (num1 + num2));
            res = num1 + num2;
            return res;
        };

        int result = calculator.add(5,10);
        System.out.println("Result: " + result);
    }
}
