import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] Args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M < 45 && H == 0){
            H = 23;
            M = M + 15;
            bw.write(H+ " " + M);
        }
        else if(M < 45){
            H = H - 1;
            M = M + 15;
            bw.write(H + " " + M);
        }
        else{
            M = M - 45;
            bw.write(H + " " + M);
        }

        bw.flush();
        bw.close();  
        
    }
}