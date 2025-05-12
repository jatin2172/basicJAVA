//check for valid integer (positive or negative)
import java.util.regex.*;

public class validinteger {
    public static void main(String[] args) {
        String ip = "-4";
        Pattern p = Pattern.compile("^-?\\d+$");
        Matcher m = p.matcher(ip);
        
        if (m.find()) {
            System.out.println("valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
