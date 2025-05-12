import java.util.*;
public class arraylistintegers{
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.remove(1);//removes 20
        System.out.println("After removal"+number);
        number.set(0,150);//updateindex 0 to 150
        System.out.println("UpdatedList:"+number);
        System.out.println("using for loop");
        int n=number.size();
        for (int i = 0; i < n; i++) {
            System.out.println(number.get(i));
        }
        //extract sublist
        List<Integer> sublist=number.subList(1,4);
        System.out.println("Sublist: "+sublist);
    }
}