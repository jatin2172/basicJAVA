import java.io.*;
import java.time.LocalDateTime;

public class Example1_2 {
    public static void main(String[] args) throws IOException {
        // 1. Create timestamped entry
        String entry = LocalDateTime.now() + " - Event occurred\n";
        
        // 2. Open FileWriter in append mode
        FileWriter fw = new FileWriter("app.log", true);
        BufferedWriter bw = new BufferedWriter(fw);
        
        // 3. Write the entry
        bw.write(entry);
        
        // 4. Close BufferedWriter (which also closes FileWriter)
        bw.close();
    }
}