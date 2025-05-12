//given an integer array and target return the indices of two nos which adds upto given target use map<int,int>\
import java.util.*;
public class target{
    public static void main(String[] args) {
        int a[]={2,7,11,15};
        int target=9;
        int n=a.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(a[i], i);
        }
        for(int i=0;i<n;i++){
            int complement=target-a[i];
            if(h.containsKey(complement)&&i!=h.get(complement)){
                System.out.println(i+" "+h.get(complement));
                break;
            }
        }
    }
}