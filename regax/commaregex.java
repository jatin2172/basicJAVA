import java.util.regex.*;

public class commaregex {
    public static void main(String[] args) {
        String ip = "apple,banana,grapes";
        Pattern p = Pattern.compile("[^,]+");
        Matcher m = p.matcher(ip);
        
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
