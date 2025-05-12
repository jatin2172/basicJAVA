public class productres{
    public static void main(String[] args) {
        int arr[]={10,3,0,6,2};
        int n=arr.length;
        int product=1;
        for(int i:arr){
            if(i!=0)
            product*=i;
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]!=0)
            res[i]=product/arr[i];
            else{
                res[i]=product;
            }
        }
        for(int i:res){
            System.out.println(i);
        }
    }
}