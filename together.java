public class together{
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
        int c0=0,c1=0,c2=0;
        for(int i:nums){
            if(i==0){
                c0++;
            }
            else if(i==1){
                c1++;
            }
            else{
                c2++;
            }
        }
        int k=0;
        while(c0>0){
            nums[k]=0;
            k++;
            c0--;
        }
        while(c1>0){
            nums[k]=1;
            k++;
            c1--;
        }
        while(c2>0){
            nums[k]=2;
            k++;
            c2--;
        }
        for (int elem : nums) {
            System.out.println(elem+" ");
        }
    }
}