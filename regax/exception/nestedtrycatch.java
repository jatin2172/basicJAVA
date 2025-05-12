public class nestedtrycatch {
    public static void main(String[] args) {
        try {
            int[] a=new int[5];
            int b = 10;
            try 
            {
                int result=a[6];
                System.out.println(result);
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Internal : " + e.getMessage());
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("External : " + e.getMessage());
        }
    }
}