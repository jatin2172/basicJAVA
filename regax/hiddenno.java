//find all nos hidden inside a text
import java.util.regex.*;

public class hiddenno {
    public static void main(String[] args) {
        String ip = "there are 2 apples and 10 bananas 12";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(ip);
        
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
