import java.util.*;
public class arraytoarraylist{
    public static void main(String[] args){
        Integer[] numbers={1,2,3,4,5};
        ArrayList<Integer> numlist=new ArrayList<>(Arrays.asList(numbers));
        System.out.println(numlist);
    }
}