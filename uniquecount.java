import java.util.*;
public class uniquecount{
    public static void main(String[] args) {
        int arr[]={1,2,2,1,1,3};
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashSet<Integer> s=new HashSet<>();
        for (int elem : arr) {
            hm.put(elem, hm.getOrDefault(elem,0)+1);
        }
        for(int val:hm.values()){
            s.add(val);
        }
        if(s.size()==hm.size()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}