import java.util.*;
public class arraylistname{
    public static void main(String[] args){
        ArrayList<String> names=new ArrayList<>();
        names.add("ram");
        names.add("hari");
        names.add("sujit");
        names.add("david");
        names.add(1, "Bob");
        System.out.println(names);
    }
}