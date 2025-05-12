//given an integer array and target return the indices of two nos which adds upto given target use hashset
import java.util.*;
public class targethashset{
    public static void main(String[] args) {
        int a[]={2,7,7,11,15};
        int target=14;
        int n=a.length;
        boolean ans=false;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<n;i++){
            int complement=target-a[i];
            if(h.contains(complement)){
                ans=true;
                break;
            }
            h.add(a[i]);
        }
        System.out.println(ans);
    }
}