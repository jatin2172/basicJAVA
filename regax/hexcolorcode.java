//check if the given string is a valid hex colorcode(e.g. #ff5733)
import java.util.regex.*;

public class hexcolorcode {
    public static void main(String[] args) {
        String ip = "#ff5733";
        Pattern p = Pattern.compile("^#[a-f0-9]{6}");
        Matcher m = p.matcher(ip);
        
        if(m.find()) {
            System.out.println("valid");
        }
        else{
            System.out.println("not valid");
        }
    }
}
