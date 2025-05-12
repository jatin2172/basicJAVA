import java.util.*;
public class arr_hash{
    public static void main(String[] args) {
        ArrayList<String> product=new ArrayList<>();
        product.add("soap");
        product.add("salt");
        product.add("biskit");
        product.add("fruits");
        product.add("chips");
        product.add("sugar");
        product.add("soap");
        System.out.println(product);
        HashSet<String> defproduct=new HashSet<>();
        defproduct.add("sugar");
        defproduct.add("soap");

        HashSet<String> nondef=new HashSet<>();

        for(String pro:product){
            if(!defproduct.contains(pro)){
                nondef.add(pro);
            }
        }
        System.out.println(nondef);
    }
}