//check whether "java" appears as a whole word or not in a given string
import java.util.regex.*;
public class apper{
    public static void main(String[] args) {
        String s="java is a programming language";
        String checker="\\bjava\\b";//\b is used for word boundary
        Pattern p=Pattern.compile(checker);
        Matcher m=p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}