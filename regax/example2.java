import java.util.regex.*;
public class example2{
    public static void main(String[] args) {
        String ip="abc123";
        String rule1="^\\w+$";
        String rule2="\\d+";
        Pattern p=Pattern.compile(rule1);
        System.out.println(p.matcher(ip).matches());
        Pattern p1=Pattern.compile(rule2);
        System.out.println(p1.matcher(ip).find());
    }
}