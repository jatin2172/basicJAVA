import java.util.*;

public class Hashsetequal{
    
    public static boolean isSubset(HashSet<Integer> a, HashSet<Integer> b)
    {
        for(int i : a)
            {
                if(!b.contains(i))
                {
                    return false;
                }
            }
        
        return true;
    }
    
    public static void main(String[] args)
    {
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(4);
        hs1.add(3);
        hs1.add(7);
        
        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(3);
        // hs2.add(8);
        hs2.add(7);
        hs2.add(4);
        // hs2.add(5);
        
        if(isSubset(hs1, hs2) && isSubset(hs2, hs1))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
        
        
    }
}