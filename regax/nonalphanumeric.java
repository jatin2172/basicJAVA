import java.util.regex.*;

public class nonalphanumeric{
    public static void main(String[] args){
        String s="Hello@#$%";
    String reg= "[^\\w]+";
    Pattern p= Pattern.compile(reg);
    Matcher m= p.matcher(s);
    while(m.find()){
     System.out.println("Extracted symbols are is: "+m.group());
    }
        
    }
}