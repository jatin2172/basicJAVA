import java.util.*;
public class charintmap{
    public static void main(String[] args){
        HashMap<Character,Integer> num=new HashMap<>();
        num.put('A',11);
        num.put('B',23);
        num.put('C',36);
        num.put('D',40);
        int sum=0;
        // for (var ele : num.entrySet()) {
        //     sum=sum+ele.getValue();
        // }
        /*                  OR               */
        // for (char c : num.keySet()) {
        //     sum+=num.get(c);
        // }
                /*                  OR               */
                for (int val : num.values()) {
                    sum+=val;
                }
        System.out.println(sum);
    }
}