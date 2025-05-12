import java.util.*;
public class linkedlistappend{
    public static void main(String[] args) {
        int n1,n2,i;
        LinkedList<Integer> a=new LinkedList<>();
        LinkedList<Integer> b=new LinkedList<>();
        System.out.println("Enter no of element for 1st linkedlist");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        System.out.println("Enter no of element for 2nd linkedlist");
        n2=sc.nextInt();
        System.out.println("enter the elements for linkedlist 1 :");
        for(i=0;i<n1;i++){
            a.add(sc.nextInt());
        }
        System.out.println("enter the elements for linkedlist 2 :");
        for(i=0;i<n2;i++){
            a.add(sc.nextInt());
        }
        a.addAll(b);
        System.out.println("After append the linkedlist is "+a);
    }
}