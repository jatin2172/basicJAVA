import java.util.*;

public class addhashset{
    
    public static void main(String[] args)
    {
       
       HashSet<Integer> set1 = new HashSet<>();
       set1.add(3);
       set1.add(5);
       set1.add(4);
       set1.add(7);
       
       HashSet<Integer> set2 = new HashSet<>();
       set2.add(2);
       set2.add(3);
       set2.add(8);
       
       HashSet<Integer> set3 = new HashSet<>(set1);
       
    //   for(int elem: set1)
    //   {
    //       set3.add(elem);
    //   }
       
    //   for(int elem: set2)
    //   {
    //       set3.add(elem);
    //   }
       
       set3.addAll(set2);
       
       System.out.println(set3);
        
    }
}