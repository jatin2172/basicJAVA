//check if the given string starts with a particular pattern
public class startswith {
    public static void main(String[] args) {
        String str= "My name is aditya maurya";
        String pattern= "My ";
        boolean ans= true;
        for(int i=0; i<=pattern.length()-1;i++)
        {
            if(str.charAt(i)!= pattern.charAt(i))
            {
                ans= false;
                break;
            }
        }
        if(ans){
            System.out.println("The string starts with the pattern");
        }
        else{
            System.out.println("The string does not start with the pattern");
        }
    }
}