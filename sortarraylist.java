import java.util.*;
public class sortarraylist{
public static void main(String[] args) {
    ArrayList<Integer> num=new ArrayList<>();
    num.add(100);
    num.add(90);
    num.add(80);
    num.add(80);
    num.add(85);
    num.add(87);
    Collections.sort(num);
    System.out.println(num);
}
}