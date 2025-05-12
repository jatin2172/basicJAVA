public class removespace {
    public static void main(String[] args) {
        String s= "My name is Aditya ";
        char[] adi= s.toCharArray();
        String res="";
        for(int i= 0; i<adi.length;i++)
        {
            if(adi[i]==' ')
            {
                continue;
            }
            res=res+adi[i];
        }
     System.out.println(res);   
    }
}