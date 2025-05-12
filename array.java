public class array{
    public static void main(String[] args) {
        int[] a=new int[5];//new way of initialization of array//
        for (int i =0; i < 5; i++) {
            a[i]=i;
        }
        int n=a.length;
        System.out.println(n);
    }
}