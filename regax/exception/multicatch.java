public class multicatch{
    public static void main(String[] args)
    {
        try
        {
            String s = null;
            s.length();
        }
        catch(ArrayIndexOutOfBoundsException iob)
        {
            System.out.println("IOB Error: " + iob.getMessage());    
        }
        catch(ArithmeticException ae)
        {
            System.out.println("AE Found :" + ae.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println("Exception!!"+ex.getMessage());
        }
        
        System.out.println("Out");
        
    }
    
}