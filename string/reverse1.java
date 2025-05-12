public class reverse1 {
    public static void main(String[] args) {
        String str = "Aditya Jain";
        String reversed = new StringBuilder(str).reverse().toString(); 
        // Using StringBuilder's reverse method
        System.out.println("Reversed String: " + reversed);
    }
}