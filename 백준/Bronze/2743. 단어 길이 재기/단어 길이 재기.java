import java.io.*;

public class Main{
    public static void main(String[] Args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String theText = br.readLine();
        
        bw.write(theText.length() + "");
        bw.flush();
        bw.close();
    }
}