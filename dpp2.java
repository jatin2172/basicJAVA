import java.util.*;
public class dpp2{
    public static void main(String[] args) {
        int[] arr={3,1,4,1,5,9,2,6};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        ArrayList<Integer> al=new ArrayList<>(hm.values());
        Collections.sort(al);
        System.out.println(al.get(al.size()-1));
    }
}