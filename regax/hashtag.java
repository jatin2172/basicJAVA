//Extract all the hashtag words from given string
import java.util.regex.*;

public class hashtag {
    public static void main(String[] args) {
        String ip = "Hello dosto #java with #AJ me is it super #fun";
        Pattern p = Pattern.compile("#\\w+");
        Matcher m = p.matcher(ip);
        
        while(m.find()) {
            System.out.println(m.group());
        }
    }
}
