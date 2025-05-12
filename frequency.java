import java.util.*;
public class frequency{
    public static void main(String[] args) {
        int n,i;
        String[] arr={"apple","banana","apple","orange","banana"};
        HashMap<String,Integer> hm=new HashMap<>();
        for(String ele:arr){
            hm.put(ele, hm.getOrDefault(ele, 0)+1);
        }
        for(var fruits:hm.entrySet()){
            System.out.println(fruits);
        }
    }
}