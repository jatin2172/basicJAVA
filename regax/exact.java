import java.util.regex.*;
public class exact{
    public static void main(String[] args) {
        String ip="9937247111";
        Pattern p=Pattern.compile("\\d+{10}");
        Matcher m=p.matcher(ip);
        if(m.matches()){
            System.out.println("valid mobile no");
        }
        else{
            System.out.println("Not valid");
        }
    }
}