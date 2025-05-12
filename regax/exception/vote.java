import java.util.Scanner;

public class vote{
    public static void check_age(int age) throws Exception {
        if(age<18){
            throw new Exception("Age shall be greater than 18");
        }
        
        System.out.println("Valid age!");
        
    }
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
           System.out.println("Enter your age:");
           int age = sc.nextInt();
           check_age(age);
        
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}