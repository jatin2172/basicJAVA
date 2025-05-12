//replace all the occurances of a particular character with the given character
import java.util.*;
public class replaceall {
    public static void main(String[] args) {
        String s="Aditya jain sir programming";
   
        String res="";
        
         for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i)!='i')
            {
                res += s.charAt(i);
            }
            else{
                res += 'j';
            }
            
        }
        
            System.out.println(res);
      
    }
}