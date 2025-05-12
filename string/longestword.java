//find the longest word in the string
public class longestword {
    public static void main(String[] args) {
        String s = "Hello Student welcome to AJ sir programming";
        String[] words = s.split(" ");
        
        String longestWord = "";
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        
        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + longestWord.length());
    }
}
