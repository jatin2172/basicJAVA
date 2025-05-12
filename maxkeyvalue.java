import java.util.*;
public class maxkeyvalue{
    public static void main(String[] args){
        HashMap<Character,Integer> num=new HashMap<>();
        num.put('A',11);
        num.put('B',23);
        num.put('C',36);
        num.put('D',40);
        int ans=Integer.MIN_VALUE;
        for (int val : num.values()) {
            if(val>ans)
            ans=val;
        }
        System.out.println(ans);
    }
    
}