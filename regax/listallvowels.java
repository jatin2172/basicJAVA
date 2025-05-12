import java.util.regex.*;
public class listallvowels{
    public static void main(String[] args) {
        String ip="Regular Expression";
        String vowels="[AEIOUaeiou]+";
        Pattern p=Pattern.compile(vowels);
        Matcher m=p.matcher(ip);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}