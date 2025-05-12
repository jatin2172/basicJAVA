//Efficiently write 10000 lines"line1" into big.txt
import java.io.*;

public class Example1_3 {
    public static void main(String[] args) throws IOException {
        // // 1. Open a PrintWriter on big.txt
        // PrintWriter pw = new PrintWriter(new FileWriter("big.txt"));
        
        // // 2. Write each line using println()
        // for(int i=1;i<=10000;i++){
        //     pw.println("Line"+i);
        // }
        
        // // 3. Close the writer (auto-flushes the buffer)
        // pw.close();
        BufferedWriter bw=new BufferedWriter(new FileWriter("big.txt"));
        for(int i=0;i<=10000;i++){
            bw.write("line"+i);
        }
        bw.close();
    }
}