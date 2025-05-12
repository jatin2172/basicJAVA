public class maximum{
    
    public static void main(String[] args)
    {
     //   max(3,5,7,2)
         int mx1 = Math.max(3,5);//5
         int mx2 = Math.max(mx1, 7);//7
         int mx3 = Math.max(mx2, 2);//7
         
         System.out.println(mx3);
         
         
         int max_val = Math.max(Math.max(Math.max(3,5), 7),2);
         
         int max_val2 = Math.max( (Math.max(3,5)) , (Math.max(7,2)) );
         
         System.out.println(max_val);
         System.out.println(max_val2);
         
         System.out.println(Math.min(4,7));
         //HW = find min among 3 numbers.
         
         System.out.println(Math.sqrt(20));
         
         //0.0 inclusive and 1.0 exclusive
         System.out.println(Math.random());
         // random number in a specific range - HW
         
         
         System.out.println(Math.abs(-4.5));
         System.out.println(Math.abs(6));
    }
 }