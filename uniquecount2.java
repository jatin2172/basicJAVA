import java.util.*;
public class uniquecount2{
    public static void main(String[] args) {
        int arr[]={1,2,2,1,1,3,3};
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashSet<Integer> s=new HashSet<>();
        int flag=0;
        for (int elem : arr) {
            hm.put(elem, hm.getOrDefault(elem,0)+1);
        }
        for(int val:hm.values()){
            if(!s.add(val)){//if it is added then it returns true if not able to add then returns false
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}