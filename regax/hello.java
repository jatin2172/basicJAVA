//string starts with hello
import java.util.regex.*;

public class hello {
    public static void main(String[] args) {
        String ip = "hello world";
        Pattern p = Pattern.compile("^hello");
        Matcher m = p.matcher(ip);
        
        if (m.find()) {
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
