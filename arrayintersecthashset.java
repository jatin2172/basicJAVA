import java.util.*;

public class arrayintersecthashset{
    
    public static void main(String[] args)
    {
        
        int[] nums1 = {4,9,2};
        int[] nums2 = {7,4,9,8,9};
        
        HashMap<Integer, Integer> count = new HashMap<>();
        
        
        for (int n : nums1) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        
        System.out.println(count);
        ArrayList<Integer> res = new ArrayList<>();
        
        
        for (int n : nums2) {
            if (count.getOrDefault(n, 0) > 0) {
                res.add(n);
                count.put(n, count.get(n) - 1);
            }
        }

        System.out.println(res);
    }
}