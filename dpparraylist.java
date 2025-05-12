import java.util.*;
public class dpparraylist{
    public static void main(String[] args){
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(5,2,9,1,5,6));
        Collections.sort(a);
        System.out.println(a);
        HashSet<Integer> s=new HashSet<>(a);
        System.out.println(s);
        System.out.println(a.get(3)+s.size());
        }
}