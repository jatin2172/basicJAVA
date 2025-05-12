import java.util.regex.*;
public class example{
    public static void main(String[] args) {
        String s="A1B22C333";
        String group="\\d+";
        Pattern p=Pattern.compile(group);
        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}