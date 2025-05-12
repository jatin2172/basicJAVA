import java.util.*;
public class noduplicate{
    public static void main(String[] args) {
        int n,i;
        int[] arr={3,5,3,1,1,2};
        HashSet<Integer> hs=new HashSet<>();
        for(int ele:arr){
            hs.add(ele);
        }
            System.out.println(hs);
    }
}