import java.util.*;
public class arr_hash2{
    public static void main(String[] args) {
        ArrayList<String> product=new ArrayList<>();
        product.add("soap");
        product.add("salt");
        product.add("biskit");
        product.add("fruits");
        product.add("chips");
        product.add("sugar");
        product.add("soap");
        HashSet<String> allproduct=new HashSet<>(product);
        System.out.println(allproduct);
        HashSet<String> defproduct=new HashSet<>();
        defproduct.add("sugar");
        defproduct.add("soap");
        allproduct.removeAll(defproduct);
        System.out.println(allproduct);
    }
}