import java.util.*;
public class sortdecendingorder{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(7);
        arr.add(3);
        arr.add(40);
        arr.add(30);
        // Collections.sort(arr,(x,y)->y-x);
        Collections.sort(arr,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return b-a;
            }
        }
        );
        System.out.println(arr);
    }
}