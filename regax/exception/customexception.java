import java.util.Scanner;
public class customexception
{
public static class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        try 
        {
            if (age < 18) {
                
                throw new InvalidAgeException("You are not allowed to vote");
                // int a = 10/0;
            } else {
                System.out.println("You are eligible to vote!");
            }
        } 
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            
            sc.close();
        }
    
}
}