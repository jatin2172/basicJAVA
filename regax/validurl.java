//check if the given string is a valid url or not
import java.util.regex.*;

public class validurl {
    public static void main(String[] args) {
        String ip = "http://www.google.com";
        Pattern p = Pattern.compile("^(https?|ftp)://[\\w+]+$");
        Matcher m = p.matcher(ip);
        
        if(m.matches()) {
            System.out.println("yes");
        }
    }
}
