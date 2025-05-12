import java.util.*;
public class arraylistfruitname{
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Grape");
        System.out.println("Fruit List:"+fruits);
        for (String s : fruits) {
            System.out.println(s+" ");
        }
     boolean found=fruits.contains("Grape") ;
     System.out.println("Contains 'Grape'"+found);
     int n=fruits.size();
     System.out.println("size of list is:"+n);
     //Reverse the list
     Collections.reverse(fruits);
     System.out.println(fruits);
    }
}