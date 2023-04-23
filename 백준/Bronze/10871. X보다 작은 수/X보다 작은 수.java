import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] Args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Long N = Long.parseLong(st.nextToken());
        Long X = Long.parseLong(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        for(Long i = 1L; i <= N; i++){
            Long A = Long.parseLong(st.nextToken());
            if(A < X){
                bw.write(A.toString() + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}