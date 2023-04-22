import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] Args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Long num = Long.parseLong(st.nextToken());
        for(Long i = num; i >= 1; i--){
            bw.write(Long.toString(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}