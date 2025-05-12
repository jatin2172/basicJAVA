import java.util.regex.*;

public class endbye {
    public static void main(String[] args) {
        String ip = "bye";
        Pattern p = Pattern.compile(".*bye$");
        Matcher m = p.matcher(ip);
        
        while (m.find()) {
            System.out.println("yes");
        }
    }
}
