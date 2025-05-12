public class vowels {
    public static void main(String[] args) {
        String str1 = "Aditya";
        int n = str1.length();
        int count = 0;

        String str = str1.toLowerCase();
        
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println(count);
    }
}
