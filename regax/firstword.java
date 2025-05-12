//Extract the first word in the given string
import java.util.regex.*;

public class firstword {
    public static void main(String[] args) {
        String ip = "Surya Prakash Das";
        Pattern p = Pattern.compile("^\\w+");
        Matcher m = p.matcher(ip);
        
        if(m.find()) {
            System.out.println("First word: "+m.group());
        }
    }
}
