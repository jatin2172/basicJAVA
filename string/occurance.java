//find the occurances of a given character in a given string
public class occurance {
    public static void main(String[] args) {
        String str= "Aditya sir";
        int freq=0;
        char c= 'i';
        for(int i=0;i<str.length();i++)
        {
            if(c==str.charAt(i))
            {
                freq++;
            }

        }
        System.out.println(freq);

    }
}