import java.util.*;
public class mergearraylist{
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("AJ");
        a.add("surya");
        a.add("Aditya");
        ArrayList<String> b=new ArrayList<>();
        b.add("Divyansh");
        b.add("Bikash");
        a.addAll(b);
        System.out.println(a);
    }
}