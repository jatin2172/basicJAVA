//replace multiple space with single space

public class multiplespace {
    public static void main(String[] args) {
        String ip = "        Surya  Prakash    Das ";
        String result=ip.replaceAll("\\s+", " ");
        System.out.println("original: "+ip);
        System.out.println("After replacement : "+result);
    }
}
