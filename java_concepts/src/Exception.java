import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exception{
    static void convertDate(String inputDate){
        try{
            SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd/mm/yyyy");
            Date date = inputDateFormat.parse(inputDate);
            SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy/mm/dd");
            String outputDate = outputDateFormat.format(date);
            System.out.println("New format yyyy/mm/dd: " + outputDate);
        }
        catch (ParseException e){
            System.out.println("Error while converting");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the date in dd/mm/yyyy format: ");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        convertDate(date);
    }
}








/*import java.util.Scanner;

class Vali{
    public void isNameValid(String name) throws InvalidName{
        if(name.length()<3)
            throw new InvalidName("Name not valid");
        System.out.println("Valid");
    }
}

public class Exception{
    public static void main(String[] args) {
        Vali obj = new Vali();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        try{
            obj.isNameValid(name);
        }
        catch(InvalidName e){
            System.out.println(e);
        }
    }
}

class InvalidName extends java.lang.Exception{
    InvalidName(String invalidName){
        super(invalidName);
    }
}
*/








/*
public class Exception {
    public static void main(String[] args) {
        try{
            int a = 10/0;
            //nested try
            try{
                int num = Integer.parseInt("Ro");
            }
            catch (NumberFormatException e){
                System.out.println("Cannot be parsed");
                e.printStackTrace();
            }
        }
        catch(ArithmeticException e){
            System.out.println("Cannot be divided by zero");

        }

        try{
            int x = 0;
            if(x == 0)
                throw new ArithmeticException("MyException");
        }
        catch (ArithmeticException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
*/









/*
class Val{
    static void validate(int n) throws InvalidInputException{
        if(n>100)
            throw new InvalidInputException("Invalid input");
        System.out.println("Valid input");
    }
}

public class Exception{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        try{
            Val.validate(num);
        }
        catch (InvalidInputException e){
            System.out.println(e);
        }
    }
}

class InvalidInputException extends java.lang.Exception {
    InvalidInputException(String exceptionText){
        super(exceptionText);
    }
}
*/
