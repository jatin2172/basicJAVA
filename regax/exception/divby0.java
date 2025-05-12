public class divby0{
    public static void main(String[] args) {
        try {
            int val=10/0;
        } catch (ArithmeticException e) {
            System.out.println("Error!"+e.getMessage());
        }
        
    }
}