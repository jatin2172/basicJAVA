public class stockmultiple2{
    public static void main(String[] args) {
        int a[]={100,180,260,310,40,535,695};
        int n=a.length;
        int buy=a[0];
        int profit=0;
        for(int i=1;i<n-1;i++){
            if(a[i]>a[i+1]){
                profit+=a[i]-buy;
                buy=a[i+1];
                i++;
            }
        }
        System.out.println(profit);
    }
}