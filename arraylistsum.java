import java.util.*;
public class arraylistsum{
    public static void main(String[] args) {
        int n,i,sum=0;
        ArrayList<Integer> a=new ArrayList<>();
        System.out.println("Enter no of element");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter the elements");
        for(i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        for(int elem:a){
            sum+=elem;
        }
        System.out.println("The sum is "+sum);
    }
}