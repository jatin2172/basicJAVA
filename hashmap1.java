import java.util.*;
public class hashmap1{
public static void main(String[] args) {
    HashMap<String,String> capitals=new HashMap<>();
    capitals.put("France", "Paris");

    capitals.put("Japan", "To");
    
    capitals.put("Germany", "Berlin");
    
    capitals.put("India", "New Delhi");
    
    capitals.put("Brazil", "Brasília");
    
    capitals.put("Canada", "Ottawa");
    
    capitals.put("Australia", "Canberra");
    
    System.out.println("Country Capitals: " + capitals);
    System.out.println("The capital of france is:"+capitals.get("France"));
    capitals.put("Japan", "Tokyo");
    System.out.println("The capital of Japan updated to:"+capitals.get("Japan"));
    capitals.remove("Brazil");
    System.out.println("The updated map is ="+capitals);
    System.out.println("Is India Exits in key?"+capitals.containsKey("India"));
    System.out.println("Is Paris is an capital of any country?"+capitals.containsValue("Paris"));

    //DISPLAY USING FORLOOP
    for(var entry:capitals.entrySet()){
        System.out.println(entry.getKey()+"=>"+entry.getValue());
    }
}
}