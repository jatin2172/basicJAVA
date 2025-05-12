//given an array of strings group the anagram together
import java.util.*;

public class anagram {
    public static void main(String[] args) {
        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> map = new HashMap<>();

        for (String word : s) {
            // Convert word to char array, sort it, then convert back to string
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Group words by their sorted key
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(word);
        }

        // Collect all grouped anagrams into a list
        List<List<String>> result = new ArrayList<>(map.values());

        // Print the result
        System.out.println(result);
    }
}
