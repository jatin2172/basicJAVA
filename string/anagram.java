//check the given two strings are anagrams or not
public class anagram {

    public static void main(String[] args) {
        String str1 = "listn";
        String str2 = "lent";

        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
            return;
        }

        int[] count = new int[26]; 
    
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']--;
        }

        for (int i = 0; i < str2.length(); i++) {
            count[str2.charAt(i) - 'a']++;
        }


            for (int i = 0; i < 26; i++) {
               System.out.print(count[i] + " ");
            }
            
            System.out.println();
            
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                System.out.println("Strings are Not anagrams");
                return;
            }
        }

        System.out.println("Strings are Anagrams");
    }
}