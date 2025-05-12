import java.util.*;
public class appermulremove{
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(4);
        a.add(2);
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int elem:a){
            freq.put(elem, freq.getOrDefault(elem, 0)+1);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int elem:a){
            if(freq.get(elem)==1){
                res.add(elem);
            }
        }
        System.out.println(res);
    }
}