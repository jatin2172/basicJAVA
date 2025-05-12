
        public class divisible{
    
            /*
            Write a method solve(int n)
            
            if n is divisible by 3 = print Fizz
            if n is divisible by 5 = print Buzz
            if n is divisible by both 3 and 5, print FizzBuzz
            
            */
            
            public static void solve(int n)
            {
                 if( n%3 == 0 && n%5 == 0)
                 {
                     System.out.println("Fizzbuzz");
                 }
                 else if(n%3 == 0)
                 {
                     System.out.println("Fizz");
                 }
                 else if(n%5 == 0)
                 {
                     System.out.println("Buzz");
                 }
            }
            
            public static void main(String[] args)
            {
                int n = 15;
                
                solve(n);
            }
         }