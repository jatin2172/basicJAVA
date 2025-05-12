public class leader{
    public static void main(String[] args) {
        int a[]={16,17,4,3,5,2};
        int n=a.length;
        int leader=a[n-1];
        System.out.println(leader);
        for(int i=n-1;i>=0;i--){
            if(a[i]>leader){
                System.out.println(a[i]);
                leader=a[i];
            }
        }
    }
}