import java.util.regex.*;

public class capital {
    public static void main(String[] args) {
        String ip = "Today is a Beautiful  DAY";
        Pattern p = Pattern.compile("\\b[A-Z][a-z]*\\b");
        Matcher m = p.matcher(ip);
        
        while (m.find()) {
            System.out.println("Sentence case words:"+m.group());
        }
    }
}
