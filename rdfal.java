import java.util.*;
public class rdfal{
    public static void main(String[] args){
        ArrayList<Integer> number=new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(20);
        number.add(60);
        number.add(50);
        System.out.println(number);
        HashSet<Integer> after=new HashSet<>(number);
        System.out.println("unique elemewnt are : "+after);
    }
}