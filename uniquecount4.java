import java.util.*;
public class uniquecount4{
    public static void main(String[] args) {
        int arr[]={1,2,2,1,1,3};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int elem : arr) {
            hm.put(elem, hm.getOrDefault(elem,0)+1);
        }
        System.out.println(hm);
        HashMap<Integer,Integer> hm2=new HashMap<>();
        for(int freq:hm.values()){
            hm2.put(freq, hm2.getOrDefault(freq,0)+1);
        }
        System.out.println(hm2);
        if(hm.size()==hm2.size()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}