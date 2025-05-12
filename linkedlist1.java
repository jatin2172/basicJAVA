import java.util.*;
public class linkedlist1{
    public static void main(String[] args) {
        LinkedList<Integer> ele=new LinkedList<>();
        ele.add(20);
        ele.add(30);
        ele.add(40);
        ele.addFirst(10);
        ele.addLast(50);
        System.out.println(ele);
        int f=ele.removeFirst();
        int l=ele.removeLast();
        System.out.println(f+" is removed from first");
        System.out.println(l+" is removed from last");
        System.out.println(ele);
    }
}