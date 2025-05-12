import java.util.regex.*;

public class nameage {
    public static void main(String[] args) 
    {
         String s="John Doe(30)Steve Jobs(40)Alan Walker(45)";
         
        Pattern a1= Pattern.compile("[A-Za-z ]+");
        Matcher n1 = a1.matcher(s);
        while(n1.find()){
            System.out.println(n1.group());
        }
        Pattern a2= Pattern.compile("\\d+");
        Matcher n2 = a2.matcher(s);
        while(n2.find()){
            System.out.println(n2.group());
        }
    }
}