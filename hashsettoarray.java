import java.util.*;
public class hashsettoarray{
    public static void main(String[] args){
        HashSet<Integer> number=new HashSet<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(20);
        number.add(60);
        number.add(50);
        Object[] numarray=number.toArray();
        System.out.println(numarray[1]);
    }
}