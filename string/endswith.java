//check if the given string ends with a particular pattern
public class endswith {
    public static void main(String[] args) {
        String str= "My name is surya";
        String pattern= "surya";
        boolean ans= true;
        int n=str.length()-1;
        for(int i=pattern.length()-1; i>=0;i--)
        {
            if(str.charAt(n--)!= pattern.charAt(i))
            {
                ans= false;
                break;
            }
        }
        if(ans){
            System.out.println("The string ends with the pattern");
        }
        else{
            System.out.println("The string does not end with the pattern");
        }
    }
}