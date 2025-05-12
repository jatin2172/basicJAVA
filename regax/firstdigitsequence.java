import java.util.regex.*;
public class firstdigitsequence{
    public static void main(String[] args) {
        String ip="item42price99";
        Pattern p=Pattern.compile("\\d+");
        Matcher m=p.matcher(ip);
        if(m.find()){
            System.out.println("Digits: "+m.group());
            System.out.println("Start position : "+m.start());
            System.out.println("End position: "+(m.end()-1));
        }
    }
}