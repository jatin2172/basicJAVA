public class maxstock{
    public static void main(String[] args) {
        int price[]={7,10,1,3,6,9,2};
        int n=price.length;
        int max=0,min=price[0];
        for(int i=1;i<n;i++){
            max=Math.max(max,price[i]-min);
            min=Math.min(min,price[i]);
        }
        System.out.println(max);
    }
}