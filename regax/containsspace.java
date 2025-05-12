import java.util.regex.*;

public class containsspace {
    public static void main(String[] args) {
        String s = "Surya Prakash Das";
        Pattern p = Pattern.compile("\\s+.*");
        boolean containsSpace =p.matcher(s).find();//find returns true when a whitespace arises
        System.out.println(containsSpace);  
    }
}
