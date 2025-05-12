import java.util.*;
public class firstrepeat{
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(4);
        a.add(2);
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        int ans=-1;
        HashSet<Integer> s=new HashSet<>();
        for(int ele :a){
            if (s.contains(ele)) {
                ans=ele;
                break;
            }
            else{
                s.add(ele);
            }
        }
        System.out.println(ans);
    }
}