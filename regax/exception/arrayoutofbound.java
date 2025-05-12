public class arrayoutofbound{
    public static void main(String[] args)
    {
        try
        {
            int[] a = new int[5];
            a[10] = 12;
        }
        catch(ArrayIndexOutOfBoundsException iob)
        {
            System.out.println("Try to access within the limit: " + iob.getMessage());    
        }
        catch(Exception ex)
        {
            System.out.println("Exception!!" + ex.getMessage());
        }
        
        System.out.println("Out");
        
    }
    
}