import java.util.*;
public class sortlist{
    public static void main(String[] args) {
        int n,i;
        ArrayList<String> a=new ArrayList<>();
        System.out.println("Enter no of element");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter the elements");
        for(i=0;i<n;i++){
            a.add(sc.next());
        }
        Collections.sort(a);
       System.out.println(a);
    }
}