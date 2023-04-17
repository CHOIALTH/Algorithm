import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] Args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while ((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A != 0 && B != 0){
                bw.write(Integer.toString(A + B));
                bw.newLine();                
            }

        }

        bw.flush();
        bw.close();
    }
}
