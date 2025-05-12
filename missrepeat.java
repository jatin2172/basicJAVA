public class missrepeat {
    public static void main(String[] args) {
        int a[] = {4, 3, 6, 2, 1, 1};
        int n = a.length;

        int[] count = new int[n + 1]; // use n+1 to include element n

        for (int num : a) {
            count[num]++;
        }

        int repeating = -1, missing = -1;
        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                missing = i;
            } else if (count[i] == 2) {
                repeating = i;
            }
        }

        System.out.println("Repeating element: " + repeating);
        System.out.println("Missing element: " + missing);
    }
}
