import java.util.*;
public class hashset1{
    public static void main(String[] args) {
        HashSet<Integer> number=new HashSet<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(20);
        number.add(60);
        number.add(50);

        System.out.println("HashSet"+number);

        System.out.println("is it contains 20: "+number.contains(20));

        number.remove(20);
        System.out.println("The set after removing 20 is : "+number);
        //iterate using for loop
        for(var n:number){
            System.out.println(n);
        }
        System.out.println("The size is "+number.size());
        number.clear();
        System.out.println("the size after clear is:"+number.size());
    }
}