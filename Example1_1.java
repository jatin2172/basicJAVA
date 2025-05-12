import java.io.*;

public class Example1_1 {
    public static void main(String[] args) throws IOException {
        // 1. Open a PrintWriter on simple.txt
        PrintWriter pw = new PrintWriter(new FileWriter("simple.txt"));
        
        // 2. Write each line using println()
        pw.println("Line1");
        pw.println("Line2");
        pw.println("Line3");
        
        // 3. Close the writer (auto-flushes the buffer)
        pw.close();
    }
}