import java.util.*;
public class EqualHashset {
 public static void main(String[] args) {
  HashSet<Integer> num1=new HashSet<>();
  HashSet<Integer> num2=new HashSet<>();
  boolean status=false;
  num1.add(10);
  num1.add(20);
  num1.add(30);
  num2.add(20);
  num2.add(10);
  num2.add(30);
  num2.add(40);
  for(int x:num1){
   if(!num2.contains(x)){
    status=true;
    break;
   }
  }
  for(int x:num2)
  {
   if(!num1.contains(x))
   {
    status=true;
    break;
   }
  }
  if(status){
   System.out.println("Given HashSets are not Equal.");
  }
  else{
   System.out.println("Given HashSets are Equal");
  }
 }
}