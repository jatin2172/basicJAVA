import java.util.regex.*;
public class onlyletters{
    public static void main(String[] args) {
        String s="Surya";
        String onlyletter="^[A-Za-z]+$";
        Pattern p=Pattern.compile(onlyletter);
        Matcher m=p.matcher(s);
        boolean isLetterOnly=m.matches();
        System.out.println(isLetterOnly);
    }
}
