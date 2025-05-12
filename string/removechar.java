//remove all occurances of a given char and print new string
public class removechar {
    public static void main(String[] args) {
        String str= "Aditya sir";
        String res="";
        char c= 'i';
        
        for(int i=0;i<str.length();i++)
        {
            if(c==str.charAt(i))
            {
                continue;
            }
            else{
                res+=str.charAt(i);
            }

        }
        System.out.println(res);

    }
}