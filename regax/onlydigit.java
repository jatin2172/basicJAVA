import java.util.regex.*;
public class onlydigit{
    public static void main(String[] args) {
        String s="2025";
        String onlydigit="^\\d+$";
        Pattern p=Pattern.compile(onlydigit);
        Matcher m=p.matcher(s);
        boolean isDigitOnly=m.matches();
        System.out.println(isDigitOnly);
    }
}
