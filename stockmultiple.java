public class stockmultiple{
    public static void main(String[] args) {
        int a[]={100,180,260,310,40,535,695};
        int n=a.length;
        int profit=0;
        for(int i=1;i<n;i++){
            profit+=Math.max(0, a[i]-a[i-1]);
        }
        System.out.println(profit);
    }
}