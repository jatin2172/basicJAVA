//check the date is in valid format dd/mm/yyyy
import java.util.regex.*;

public class date {
    public static void main(String[] args) {
        String ip = "21/03/2006";
        Pattern p = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        Matcher m = p.matcher(ip);
        
        if (m.matches()) {
            System.out.println("valid");
        }
        else{
            System.out.println("Not valid");
        }
    }
}
