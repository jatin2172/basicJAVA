public class throwsexception{
    public static void Division() throws ArithmeticException{
        int a=10/0;
    }
    public static void main(String[] args){
        try{
            Division(); 
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}