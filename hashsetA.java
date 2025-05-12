import java.util.*;
public class hashsetA{
    public static void main(String[] args) {
        HashSet<String> str=new HashSet<>();
        str.add("Aditya");
        str.add("Karan");
        str.add("Aman");
        str.add("Arjun");
        str.add("Himanshu");
        str.add("Rahul");
        str.add("Surya");
        str.add("Abhi");
       Iterator<String> it=str.iterator();
       while(it.hasNext()){
        String s=it.next();
        if(!s.startsWith("A")){
            it.remove();
        }
       }
       System.out.println(str);
    }
}