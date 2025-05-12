import java.util.*;
public class cansplit{
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(3);
        a.add(6);
        a.add(2);
        a.add(4);
        a.add(7);

        int total=0,flag=0;
        int curr_sum=0,rem_sum=0;
        for(int elem:a){
            total+=elem;
        }
        for(int elem:a){
            curr_sum+=elem;
            rem_sum=total-curr_sum;
            if(curr_sum==rem_sum){
                flag=1;
                System.out.println("Yes");
                break;
            }
        }
        if(flag==0){
            System.out.println("no");
        }
    }
}